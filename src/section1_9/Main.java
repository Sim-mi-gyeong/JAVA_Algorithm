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
	  //��°��� �ڷ����� ����(�ڿ���)�̾�� ��.
	  //����->������ ��ȯ: Integer.parseInt() 

	}

}
