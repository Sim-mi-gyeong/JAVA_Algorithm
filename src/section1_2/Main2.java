package section1_2;

import java.util.Scanner;

public class Main2 {  
	
	public String solution(String str) {
		String ans="";
		for(char x: str.toCharArray()) {
			
			//�ƽ�Ű number���� �빮��:65~90, �ҹ���:97~122
			//�빮�ڿ� �ҹ��� -> 32���� -> �ҹ���-32=�빮��
			//char x ���� �� ����->�� ��ȯ
			
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
