package section1_8;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		String str = sc.nextLine();
		
		
		str=str.toUpperCase().replaceAll("[^A-Z]", "");
		String s = new StringBuilder(str).reverse().toString();
		
		if(s.equals(str)) System.out.println("YES");
		else System.out.println("NO");
		
	}

}
