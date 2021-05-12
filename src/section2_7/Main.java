package section2_7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	//	String[] str = sc.nextLine().split(" ");
		
		int[] arr = new int[n];
	 	for(int i=0; i<n; i++) {
	 		arr[i]=sc.nextInt();
	 	}
		
		int ans=0;
		int cnt=0;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]==1) {
				cnt++;
				ans+=cnt;
			} else cnt=0;
			/*
			if(str.charAt(i-1)==1) {
				cnt++;
				ans+=cnt;
			} else ans+=cnt;
			*/
		} System.out.println(ans);

	}

}
