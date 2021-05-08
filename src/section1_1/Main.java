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
		//����(������) for�� ����: for(�ڷ���'s ���� ������: �迭��) {}
		//�迭/collection's List(ArrayList, LinkedList)�� �� �� ���� -> String�� ���� �ϳ��ϳ��� ���� �迭��: .toCharArray() 
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