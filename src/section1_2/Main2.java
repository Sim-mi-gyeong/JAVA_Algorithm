package section1_2;

import java.util.Scanner;

public class Main2 {  
	
	public String solution(String str) {
		String ans="";
		for(char x: str.toCharArray()) {
			
			//아스키 number에서 대문자:65~90, 소문자:97~122
			//대문자와 소문자 -> 32차이 -> 소문자-32=대문자
			//char x 정수 비교 가능->형 변환
			if(x>=97 && x<=122) ans+=(char)(x-32);
			else ans+=(char)(x+32);
		}
			
		return ans;		
	}

	public static void main(String[] args) {
		
		Main2 obj=new Main2();
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		System.out.println(obj.solution(str));

	}

}
