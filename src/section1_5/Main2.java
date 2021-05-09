package section1_5;

import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		char[] s = str.toCharArray(); // string�� Character �迭�� ��ȯ
	
		int lt=0;
		int rt=str.length()-1;
		char tmp;
		
		while(lt<rt) {
		/*	if(Character.isAlphabetic(s[lt]) && Character.isAlphabetic(s[rt])) {  //������ ���ĺ� ���� �˻�: Character.isAlphabetic()
				//Character.isAlphabetic(s[lt]) && Character.isAlphabetic(s[rt])�� �������� ������ ��� ?
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
