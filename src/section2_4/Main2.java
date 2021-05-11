package section2_4;

import java.util.Scanner;

public class Main2 {
	
	public void solution(int n) {
		int a=1, b=1, c;
		System.out.print(a+ " " + b + " ");
		for(int i=2; i<n; i++) {
			c=a+b;
			System.out.print(c+ " ");
			a=b; //그 전의 b
			b=c; //그 전의 a
		}
	}

	public static void main(String[] args) {
		
		Main2 obj = new Main2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		obj.solution(n);
		
	}

}
