package section1_8;

import java.util.Scanner;

public class Main2 {
	
	public String solution(String str) {
		String ans="NO";
		str=str.toUpperCase().replaceAll("[^A-Z]","");
		//�빮�� A-Z������ �ƴϸ� -> �� ���� ó��
		//replaceAll(���Խ�(��� ����) or ��������, ��ü����): � ������ ���ڿ��� ���� �𸣴� ���
		//replace(ã�����ڿ�, �ٲܹ��ڿ�)
		
		String s = new StringBuilder(str).reverse().toString();
		
		if(str.equals(s)) ans="YES";
		
	
		return ans;
	}

	public static void main(String[] args) {
		Main2 obj = new Main2();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(obj.solution(str));

	}

}
