package Bai6_5;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6_5 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt();
		int sum=0;
		int []a= new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			sum+=a[i];
		}
		double avr=(double)sum/n;
		for(int x:a) {
			System.out.print(x + " ");
		}
		System.out.println();
		System.out.println(sum);
		System.out.println(avr);
		Arrays.sort(a);
		for(int x:a) {
			System.out.print(x + " ");
		}
		sc.close();
	}
}
