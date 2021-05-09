package section1_6;

import java.util.Scanner;

public class Main2 {
	
	public String solution(String str) {
		String ans="";
		for(int i=0; i<str.length(); i++) {
	      //System.out.println(str.charAt(i) + " " + i + str.indexOf(str.charAt(i)));  
		  //.indexOf(): 해당 문자가 처음 발견된 index return 
		  //자신의 위치=처음 반견된 index 요소 출력(다르면 제거)
			
			if(str.indexOf(str.charAt(i))==i) ans+=str.charAt(i);
		}
		return ans; 
	}

	public static void main(String[] args) {
		Main2 obj = new Main2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(obj.solution(str));

	}

}
