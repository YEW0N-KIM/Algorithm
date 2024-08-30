package Baekjoon;

import java.util.Scanner;

public class Baekjoon25304 { 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0; 
		for(int i =0; i<n; i++) {
			int price = sc.nextInt();
			int pcs = sc.nextInt();
			sum += price*pcs;
		}
		System.out.println(sum == x? "Yes":"No");
		sc.close();
	}
}
