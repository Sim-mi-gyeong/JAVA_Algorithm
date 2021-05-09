package section1_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
	
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> ans=new ArrayList<>();
		for(String x: str) {
			char[] s = x.toCharArray(); // ���� ������ -> string�� character �迭��
		 // Character �迭 s���� lt�� rt�� ���� index ����(lt+1, rt-1)�ذ��� ������ 
	     // �迭�� ���� ���� ¦��/Ȧ���� ��: lt<rt���� �ݺ� ����
			
			int lt=0, rt=x.length()-1;
			while(lt<rt) {
				char tmp=s[lt]; // ������ ���ڿ� s[lt]����
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(x); //���� �迭�� strungȭ(valueOf: static���� ����� class �޼��� -> ��ü. X)
			ans.add(tmp);
			
		}
		
		return ans;
	}

	public static void main(String[] args) {
		Main3 obj = new Main3();
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i]=sc.next();
		}
		
		for(String x: obj.solution(n,  str)) {
			System.out.println(x);
		}
		
	}

}