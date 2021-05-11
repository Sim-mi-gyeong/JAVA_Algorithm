package section1_8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> arr = new ArrayList<>(); 
		
		String[] str = sc.nextLine().split(" ");
		StringBuffer[] str2 = new StringBuffer[str.length];
	//	StringBuffer sb = new StringBuffer("");
		
		for(int i=0; i<(str.length)/2; i++) {
			for(int j=0; j<str[i].length(); j++) {
				if(!(Character.isAlphabetic(str[i].charAt(j)))) {
					continue;
				} else {
					if(str[i].charAt(j)==str[i].charAt(str[i].length()-1-j)) {
						System.out.println("YES");
					} else System.out.println("NO");
					
				}
				
			}
			

			
		
		}
		
		
		
	}

}
