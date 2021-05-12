package section2_9;
//격자판 최대합

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		int ans=Integer.MIN_VALUE;
		int sum1, sum2;
		for(int i=0; i<n; i++) {
			sum1=sum2=0;
			for(int j=0; j<n; j++) {
				sum1+=arr[i][j];
				sum2+=arr[j][i];
			}
			ans=Math.max(ans, sum1); //각 합을 ans초기값과 비교
			ans=Math.max(ans, sum2);
		} 
		
		sum1=sum2=0;
		for(int k=0; k<n; k++) {
			sum1+=arr[k][k];
			sum2+=arr[k][n-1-k];
		}
	    ans=Math.max(ans, sum1);
	    ans=Math.max(ans, sum2);
	
		System.out.println(ans);

	}

}
