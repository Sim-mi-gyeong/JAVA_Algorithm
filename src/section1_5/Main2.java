package section1_5;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char[] s = str.toCharArray(); // string을 Character 배열로 변환
	
		int lt=0;
		int rt=str.length()-1;
		char tmp;
		
		while(lt<rt) {
		/*	if(Character.isAlphabetic(s[lt]) && Character.isAlphabetic(s[rt])) {  //문자의 알파벳 여부 검사: Character.isAlphabetic()
				//Character.isAlphabetic(s[lt]) && Character.isAlphabetic(s[rt])를 조건으로 설정할 경우 ?
				tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
				
			} else {
				lt++;
				rt--;
			}
			*/
			
			if (!Character.isAlphabetic(s[lt])) lt++;
			else if (!Character.isAlphabetic(s[rt])) rt--;
			else {
				tmp=s[lt];
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
	
		}
	/*	String ans=String.valueOf(s);
		
		System.out.println(ans); */
		System.out.println(s);

	}

}
