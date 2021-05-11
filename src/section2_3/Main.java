package section2_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer[] arrA=new Integer[n];
		Integer[] arrB=new Integer[n];
		
//		char ans='A';
		
		for(int i=0; i<n; i++) {
			arrA[i]=sc.nextInt();
			arrB[i]=sc.nextInt();
		}
		for(int j=0; j<n; j++) {
			if(arrA[j]==arrB[j]) System.out.println("D");
			else if(arrA[j]==1) {
				if(arrB[j]==3) System.out.println("A");
			}
			else if(arrB[j]==1) {
				if(arrA[j]==3) System.out.println("B");
			}
			else if(arrA[j]>arrB[j]) System.out.println("A");
			else System.out.println("B");
		}

	}

}
