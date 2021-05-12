package section2_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] ans = new int[n];
		
		int cnt=1;
		ans[0]=cnt;
				
		for(int i=0;i<n;i++) {
			for(int j=0; j<n; j++) {
				if(arr[i]<arr[j]) cnt++;
			} 
			ans[i]=cnt;
			cnt=1;
		}
		for(int x: ans) System.out.print(x + " ");

	}

}
