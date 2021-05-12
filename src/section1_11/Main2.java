package section1_11;

/*
문자 count -> cnt=1로 초기화
String의 i번째와 i+1번째 비교 -> 같으면 cnt++ 
                         -> 같지 않으면 ans String에 ans+=char, cnt>1 -> ans+=cnt
String 마지막에 ""(빈 문자) 추가
*/

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String ans = "";
		str = str + "";
		int cnt=1;
		
		for(int i=0; i<str.length()-1; i++) {
			if(str.charAt(i)==str.charAt(i+1)) cnt++;
			else {
				ans+=str.charAt(i);
				if(cnt>1) ans+=String.valueOf(cnt);
				cnt=1; //다음 문자에 대한 cnt 1로 초기화
				//Integer.toString() : toString() : parameter가 null -> NPE 발생/String이 아닌 값도 출력
				//String.valueOf() : parameter가 null -> String "null" 으로 반환
				
			//	if(!(cnt==1)) ans+=cnt;
				
				
			}
		}
		System.out.println(ans);
		

	}

}
