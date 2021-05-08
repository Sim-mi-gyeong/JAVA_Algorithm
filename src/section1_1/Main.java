package section1_1;

import java.util.Scanner;

public class Main {
	
	static int solution(String str, char t) {
		int cnt=0;
		
		str=str.toUpperCase();
		t=Character.toUpperCase(t);
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==t) cnt++;  
		}
		return cnt;
	}
	/* 
		//향상된(개선된) for문 형태: for(자료형's 구성 변수명: 배열명) {}
		//배열/collection's List(ArrayList, LinkedList)만 올 수 있음 -> String의 문자 하나하나를 문자 배열로: .toCharArray() 
		for(char x: str.toCharArray()) {
			if(x==t) cnt++;
		}
		return cnt;    
	}
	*/
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str=sc.next();
		char c=sc.next().charAt(0);
		int cnt=solution(str, c);

		//equalsIgoreCase() ?
		
		System.out.println(cnt);
		
	}

}