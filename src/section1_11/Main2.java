package section1_11;

/*
���� count -> cnt=1�� �ʱ�ȭ
String�� i��°�� i+1��° �� -> ������ cnt++ 
                         -> ���� ������ ans String�� ans+=char, cnt>1 -> ans+=cnt
String �������� ""(�� ����) �߰�
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
				cnt=1; //���� ���ڿ� ���� cnt 1�� �ʱ�ȭ
				//Integer.toString() : toString() : parameter�� null -> NPE �߻�/String�� �ƴ� ���� ���
				//String.valueOf() : parameter�� null -> String "null" ���� ��ȯ
				
			//	if(!(cnt==1)) ans+=cnt;
				
				
			}
		}
		System.out.println(ans);
		

	}

}
