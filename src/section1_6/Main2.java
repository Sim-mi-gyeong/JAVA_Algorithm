package section1_6;

import java.util.Scanner;

public class Main2 {
	
	public String solution(String str) {
		String ans="";
		for(int i=0; i<str.length(); i++) {
	      //System.out.println(str.charAt(i) + " " + i + str.indexOf(str.charAt(i)));  
		  //.indexOf(): �ش� ���ڰ� ó�� �߰ߵ� index return 
		  //�ڽ��� ��ġ=ó�� �ݰߵ� index ��� ���(�ٸ��� ����)
			
			if(str.indexOf(str.charAt(i))==i) ans+=str.charAt(i);
		}
		return ans; 
	}

	public static void main(String[] args) {
		Main2 obj = new Main2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(obj.solution(str));

	}

}
