package section2_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] arr = new Integer[n];
		
		int ans=1; //맨 앞사람은 보임
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for(int j=1; j<n; j++) {		
			if(arr[j]>arr[j-1] && arr[j]>max) {
				ans++;
				max=arr[j];
			}
		}
		System.out.println(ans);
	}

}
