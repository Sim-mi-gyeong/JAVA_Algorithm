package section1_6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		ArrayList<Character> ans = new ArrayList<>();
		
		for(int i=0; i<str.length(); i++) {
			if(!(ans.contains(str.charAt(i)))) {
				ans.add(str.charAt(i));
			} else continue;
			
		}
		for(char x: ans) {
			System.out.print(x);
		}

	}

}
