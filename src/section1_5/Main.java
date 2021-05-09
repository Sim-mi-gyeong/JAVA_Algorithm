package section1_5;

//¾ËÆÄºª: 65~122
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner	sc=new Scanner(System.in);
		String str=sc.next();
		int len=str.length();
		Character[] ans = new Character[len];
		for(int i=0; i<len; i++) {
			ans[i]=str.charAt(i);
		}
		char tmp;
	    
		for(int i=0; i<len; i++) {
			if((str.charAt(i)>=65 && str.charAt(i)<=90)||(str.charAt(i)>=97 && str.charAt(i)<=122)) {
				tmp=str.charAt(i);
				ans[i]=str.charAt(len-1-i);
				ans[len-1-i]=tmp;
			}
		}
		for(char x: ans) {
			System.out.print(x);
		}

	}

}
