package section2_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n+1];  //n까지 배열 공간 생성
		int ans=0;
		
		for(int i=2; i<=n; i++) {
			if(arr[i]==0) {
				ans++;
				for(int j=i; j<=n; j+=i) {
					arr[j]=1;
				}
			}
		}
		System.out.println(ans);

	}

}
