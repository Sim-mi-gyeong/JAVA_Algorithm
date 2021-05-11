package section2_4;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		Integer[] arr = new Integer[n];
		arr[0]=1;
		arr[1]=1;
		
		for(int i=2; i<n; i++) {
			arr[i]=arr[i-1] + arr[i-2];
		}
		for(int j=0;j<n;j++) {
			System.out.print(arr[j] + " ");

		}

	}

}
