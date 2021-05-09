package section1_3;

import java.util.Scanner;

//.indexOf():() 안에 해당하는 문자열의 위치 반환
//.substring(시작위치, 마지막위치): 시작 및 마지막 위치의 인덱스로 문자열 잘라냄

public class Main3 {
	
	static String solution(String str) {
		String ans="";
		int m = Integer.MIN_VALUE, pos;
		
		while((pos=str.indexOf(' '))!=-1) { //첫번째로 발견되는 띄어쓰기 위치 반환
			                                //마지막 단어의 경우 앞에서 잘라낸 문자열 덩어리로 인해 ' '가 존재하지 않음(반복문 종료) -> 마지막 단어 처리
			String tmp=str.substring(0, pos); //띄어쓰기 전까지 문자열 잘라 tmp에 저장
			int len=tmp.length();
			if(len>m) { // 'len>=m'으로 조건 설정 시 뒤쪽에서 동일한 길이의 문자열을 답으로 -> len>m 
				m=len;
				ans=tmp; //이후 str -> tmp+' '제거 후 다음 문자열부터
			}
			str=str.substring(pos+1);
			
		}
		if(str.length()>m) ans=str;
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(solution(str));
		

	}

}
