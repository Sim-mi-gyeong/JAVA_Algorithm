package section1_7;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		str=str.toUpperCase();
		String tmp="";
		
		for(int i=str.length()-1; i>=0; i--) {
			tmp+=str.charAt(i);
		}
		
		if(tmp.equals(str)) System.out.println("YES");
		else System.out.println("NO");

	}

}
