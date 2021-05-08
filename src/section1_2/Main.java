package section1_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str=sc.next();
		String ans="";
		
		for(int i=0; i<str.length(); i++) {
			
			char c=str.charAt(i);
			
			if(Character.isUpperCase(c)) {
				c=Character.toLowerCase(c);
			} else {
				c=Character.toUpperCase(c);
			}
			ans+=c;
		}
		
	/*	for(char x: str.toCharArray()) {
			if(Character.isLowerCase(x)) ans+=Character.toUpperCase(x);
			else ans+=Character.toLowerCase(x);
		}
		*/  
		
		System.out.println(ans);

	}

}
