package section1_11;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		String ans="";
		
		int cnt=0;
		char tmp;
		ans+=str.charAt(0);
		for(int i=0; i<str.length(); i++) {
			if(i==0) {
				cnt++;
			}

			else if(!(str.charAt(i)==str.charAt(i-1))) {
				
				if(cnt==1) ans+="";
				else ans+=cnt;
				cnt=0;
				tmp=str.charAt(i);
				ans+=tmp;
				cnt++;
			} else cnt++;
	
		} ans+=cnt;  //마지막 문자의 경우 else에서 cnt++만 처리되고 값이 ans에 업데이트 되지 않아 for문 종료 후 처리
		System.out.println(ans); 
		
		//KKHSSSSSSSE -> K2HS7E
		//KSTTTSEEKFKKKDJJGG -> KST3SE2KFK3DJ2G2

	}

}
