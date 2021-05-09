package section1_4;

import java.util.ArrayList;
import java.util.Scanner;

//String���� concat �ݺ� ���� �� �ӵ� ����
//StringBuilder class: ���� ��ü ������ ���ڿ� ���� ����
//StrinfBuffer class: StrinfBuilder�� �޸� ��Ƽ������ ȯ�濡�� ����(String�� ����)
//�ֿ� �żҵ�:.append(), .insert(idx, val), .delete(idx, idx), .indexOf(val), .length(), .replace(idx, idx, val), .reverse()

public class Main2 {
	
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> ans=new ArrayList<>();
		
		for(String x: str) {
			String tmp=new StringBuilder(x).reverse().toString(); //StringBuilder class ��ü ����
			    ans.add(tmp);
		}	    
		return ans;
	}

	public static void main(String[] args) {
		Main2 obj = new Main2();
		Scanner sc = new Scanner(System.in);
		
		int n=sc.nextInt();
		String[] str = new String[n];
		for(int i=0; i<n; i++) {
			str[i]=sc.next();
		}
		
		for(String x: obj.solution(n,  str)) {
			System.out.println(x);
		}
		
	}

}
