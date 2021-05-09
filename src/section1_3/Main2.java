package section1_3;

import java.util.Scanner;

public class Main2 {
	
	static String solution(String str) {
		String ans="";
		int m=Integer.MIN_VALUE; //가장 작은 값으로 초기화
		
		String[] s = str.split(" ");
		for(String x: s) {
			int len=x.length();
			if(len>m) {
				m=len;
				ans=x;
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(solution(str));

	}

}
