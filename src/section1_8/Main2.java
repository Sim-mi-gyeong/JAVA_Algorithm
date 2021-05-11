package section1_8;

import java.util.Scanner;

public class Main2 {
	
	public String solution(String str) {
		String ans="NO";
		str=str.toUpperCase().replaceAll("[^A-Z]","");
		//대문자 A-Z까지가 아니면 -> 빈 문자 처리
		//replaceAll(정규식(모든 문자) or 기존문자, 대체문자): 어떤 향태의 문자열이 올지 모르는 경우
		//replace(찾을문자열, 바꿀문자열)
		
		String s = new StringBuilder(str).reverse().toString();
		
		if(str.equals(s)) ans="YES";
		
	
		return ans;
	}

	public static void main(String[] args) {
		Main2 obj = new Main2();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(obj.solution(str));

	}

}
