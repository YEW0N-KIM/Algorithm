package Baekjoon;

import java.util.Scanner;

public class Baekjoon2903 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int dot = 2;
		for(int i=0; i<N; i++) {
			int plus = (int)Math.pow(2, i);
			dot += plus;
		}
		
		System.out.println(dot*dot);
		
	}
}
