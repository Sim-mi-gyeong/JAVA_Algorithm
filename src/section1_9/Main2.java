package section1_9;

import java.util.Scanner;

// ans 초기화 후 갱신
// ans = ans * 10 + ( x - 48) -> ans에 해당하는 수를 10씩 배수하며 
// x>=48('0') && x<=57('9') -> 문자형 숫자로 접근

public class Main2 {
	
	public int solution(String s) {
		int ans=0;
		
		for(char x: s.toCharArray()) {
			if(x>=48 && x<=57) ans=ans*10+(x-48);
		}
		
		return ans;
	}

	public static void main(String[] args) {
		Main2 obj = new Main2();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(obj.solution(str));

	}

}
