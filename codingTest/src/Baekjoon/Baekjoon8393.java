package Baekjoon;

import java.util.Scanner;

public class Baekjoon8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long sum = 0;
		for(int i=1; i<=n; i++) {
			sum += i;
		}
		System.out.println(sum);
		sc.close();
	}
}
