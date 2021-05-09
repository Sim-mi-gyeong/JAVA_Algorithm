package section2_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
	
	public ArrayList<Integer> solution(int n, int[] arr) {
		ArrayList<Integer> ans = new ArrayList<>();
		ans.add(arr[0]);
		for(int i=1; i<n; i++) {
			if(arr[i]>arr[i-1]) ans.add(arr[i]);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		Main2 obj = new Main2();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		for(int x: obj.solution(n, arr)) {
			System.out.print(x+ " ");
		}
		
	}

}
