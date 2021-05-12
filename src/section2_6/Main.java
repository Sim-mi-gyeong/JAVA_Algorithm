package section2_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	public static boolean isPrime(int res) {
		if(res==1) return false;
		
		for(int i=2; i<res; i++) {
			if(res%i==0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		} 
		
		ArrayList<Integer> ans = new ArrayList<>();
	//	int res = 0;
		
		for(int i=0; i<n; i++) {
			int res = 0;  // ans의 각 배열 요소에 대해 res 초기값=0
			int tmp=arr[i];
			while(tmp>0) {
				int t=tmp%10;
				res=res*10 + t;
				tmp/=10;
			}
			if(isPrime(res)) ans.add(res);
		}
		for(int x: ans) System.out.print(x + " ");

	}

}
