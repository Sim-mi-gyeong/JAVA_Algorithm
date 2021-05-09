package section1_3;

import java.util.Scanner;

//.indexOf():() �ȿ� �ش��ϴ� ���ڿ��� ��ġ ��ȯ
//.substring(������ġ, ��������ġ): ���� �� ������ ��ġ�� �ε����� ���ڿ� �߶�

public class Main3 {
	
	static String solution(String str) {
		String ans="";
		int m = Integer.MIN_VALUE, pos;
		
		while((pos=str.indexOf(' '))!=-1) { //ù��°�� �߰ߵǴ� ���� ��ġ ��ȯ
			                                //������ �ܾ��� ��� �տ��� �߶� ���ڿ� ����� ���� ' '�� �������� ����(�ݺ��� ����) -> ������ �ܾ� ó��
			String tmp=str.substring(0, pos); //���� ������ ���ڿ� �߶� tmp�� ����
			int len=tmp.length();
			if(len>m) { // 'len>=m'���� ���� ���� �� ���ʿ��� ������ ������ ���ڿ��� ������ -> len>m 
				m=len;
				ans=tmp; //���� str -> tmp+' '���� �� ���� ���ڿ�����
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
