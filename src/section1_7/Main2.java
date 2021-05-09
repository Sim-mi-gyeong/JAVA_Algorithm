package section1_7;

import java.util.Scanner;

//길이를 2로 나눈 '전'까지 반복(비교)
public class Main2 {
	
	static String solution(String str) {
		String ans="YES";
		str=str.toUpperCase();
		int len = str.length();
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i)!=str.charAt(len-i-1)) return "NO";
		}
		
		return ans;
	}

	public static void main(String[] args) {
		Main2 obj = new Main2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(solution(str));
	}

}
