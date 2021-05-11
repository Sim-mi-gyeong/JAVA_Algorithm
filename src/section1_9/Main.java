package section1_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str=sc.next();
		ArrayList<Character> ans=new ArrayList<>();
		
		for(int i=0; i<str.length(); i++) {
			if(!Character.isAlphabetic(str.charAt(i))) {
				ans.add(str.charAt(i));
			}
		}
		if(ans.get(0)=='0') ans.remove(0);
	
		for(char x: ans) System.out.print(x);
	  //출력값의 자료형이 정수(자연수)이어야 함.
	  //문자->정수형 변환: Integer.parseInt() 

	}

}
