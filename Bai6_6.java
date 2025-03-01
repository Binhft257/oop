package Bai6_6;

import java.util.Scanner;

public class Bai6_6 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int k=sc.nextInt();
		int [][]a= new int[n][k];
		int [][]b= new int[n][k];
		int [][]c= new int[n][k];

		for(int i=0;i<n;i++) {
			for(int j=0;j<k;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<k;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println();
		for(int i=0;i<n;i++) {
			for(int j=0;j<k;j++) {
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
