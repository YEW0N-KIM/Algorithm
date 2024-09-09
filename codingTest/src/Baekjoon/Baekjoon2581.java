package Baekjoon;

import java.util.Scanner;

public class Baekjoon2581 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		int sum = 0;
		
		int min = N;
		
		for(int i=M; i<=N; i++) {
			if(isPrime(i)) {
				sum+=i;
				if(min>i) min=i;
			}
		}
		
		if(sum == 0 ) {
			System.out.println(-1);
		} else {
			System.out.println(sum +"\n"+ min);
		}
		
	}
	private static boolean isPrime(int value) {
		if(value<2) return false;
		for(int i=2; i<value; i++) {
			if (value%i ==0 ) return false;
		}
		return true;
	}
}
