package section1_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
	
	public ArrayList<String> solution(int n, String[] str) {
		ArrayList<String> ans=new ArrayList<>();
		for(String x: str) {
			char[] s = x.toCharArray(); // 직접 뒤집기 -> string을 character 배열로
		 // Character 배열 s에서 lt와 rt에 대해 index 조정(lt+1, rt-1)해가며 뒤집기 
	     // 배열의 원소 개수 짝수/홀수일 때: lt<rt까지 반복 수행
			
			int lt=0, rt=x.length()-1;
			while(lt<rt) {
				char tmp=s[lt]; // 임의의 문자에 s[lt]저장
				s[lt]=s[rt];
				s[rt]=tmp;
				lt++;
				rt--;
			}
			String tmp = String.valueOf(x); //문자 배열을 strung화(valueOf: static으로 선언된 class 메서드 -> 객체. X)
			ans.add(tmp);
			
		}
		
		return ans;
	}

	public static void main(String[] args) {
		Main3 obj = new Main3();
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