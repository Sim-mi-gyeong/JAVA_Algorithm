package section1_4;

import java.util.ArrayList;
import java.util.Scanner;

//String에서 concat 반복 수행 시 속도 저하
//StringBuilder class: 동일 객체 내에서 문자열 변경 가능
//StrinfBuffer class: StrinfBuilder와 달리 멀티스레드 환경에서 안전(String도 동일)
//주요 매소드:.append(), .insert(idx, val), .delete(idx, idx), .indexOf(val), .length(), .replace(idx, idx, val), .reverse()

public class Main2 {
	
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> ans=new ArrayList<>();
		
		for(String x: str) {
			String tmp=new StringBuilder(x).reverse().toString(); //StringBuilder class 객체 생성
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
