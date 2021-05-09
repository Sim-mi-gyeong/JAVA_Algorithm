package section2_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0; i<n; i++) {
			int a=sc.nextInt();
			arr[i]=a;
		}
		ArrayList<Integer> ans=new ArrayList<>();
		
	  /* 
		문제 잘못 이해함ㅋㅅㅋ 멍청이!
       	for(int j=0; j<arr.size(); j++) {
			int idx=arr.indexOf(n);
			if(arr.get(idx-1)<arr.get(j)) {
				ans.add(arr.get(j));
			}
			
		}
		*/ 
		ans.add(arr[0]);
		for(int j=1; j<n; j++) {
			if(arr[j]>arr[j-1]) ans.add(arr[j]);
		}
		for(int x: ans) {
			System.out.print(x+ " ");
		}

	}

}
