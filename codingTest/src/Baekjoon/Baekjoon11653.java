package Baekjoon;

import java.util.Scanner;

public class Baekjoon11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		while(N==1) {
			
		}
	}
	
	private static boolean isPrime(int value) {
		if(value<2) return false;
		for(int i=2; i<Math.sqrt(value); i++) {
			if(value%i == 0) return false;
		}
		return true;
	}
}
