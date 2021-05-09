package section1_7;

import java.util.Scanner;

public class Main3 {
	static String solution(String str) {
		String ans="NO";
		String tmp = new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(tmp)) ans="YES";
		
		return ans;
	}

	public static void main(String[] args) {
		Main2 obj = new Main2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		System.out.println(solution(str));
	}

}