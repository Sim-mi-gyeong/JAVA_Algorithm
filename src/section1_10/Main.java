package section1_10;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		char c = sc.next().charAt(0);
		
		int[] ans = new int[str.length()];
	
		int tmp = 1000;
		
		// ���ʺ��� ���ذ��� ans�� �Ÿ� �߰�
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)==c) {
				tmp=0;
			}
			else {
				tmp++;
				ans[i]=tmp;
			}
		}
		// �����ʿ��� ���� ���ϸ� ���� ������ ��ü
		for(int i=str.length()-1; i>=0; i--) {
			if(str.charAt(i)==c) {
				tmp=0;
			}
			else {
				tmp++;
				if (ans[i]>=tmp) ans[i]=tmp;
			  //ans[i].Math.min(ans[i], tmp);
			}
		}
	    for(int x: ans) System.out.print(x+ " ");

	}

}
