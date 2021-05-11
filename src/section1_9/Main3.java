package section1_9;

import java.util.Scanner;

public class Main3 {
	
	public int solution(String s) {
		String ans="";
		for(char x : s.toCharArray()) {
			if(Character.isDigit(x)) ans+=x;
		}
		
		return Integer.parseInt(ans);
		
	}

	public static void main(String[] args) {
		Main3 obj = new Main3();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(obj.solution(str));
 
	}

}
