package section1_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		String ans="";
		int idx=-1;
		for(int i=0; i<n; i++) {
			String str=sc.next();
			for(int j=str.length()-1; j>=0; j--) {
				ans+=str.charAt(j);  //.charAt(i)���� �ε��� i>=0 ���� ����
			}
			System.out.println(ans);
			ans="";
			
		}
		
	}

}
