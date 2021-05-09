package section1_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] str = sc.nextLine().split(" ");
		
		String max=str[0];
		for(int i=0; i<str.length; i++) {
			if(str[i].length()>max.length()) max=str[i]; 
		}
		System.out.println(max);
		//문장 뒤쪽에서 단어 길이가 같은 경우 고려 안 함

	}

}
