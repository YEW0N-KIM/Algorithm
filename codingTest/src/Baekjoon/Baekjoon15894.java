package Baekjoon;

import java.util.Scanner;

public class Baekjoon15894 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long answer = 0;
		if(N == 1) {
			answer = 4;
			System.out.println(answer);
		} else {
			long sum =0;
			for(int i=1; i<N; i++) {
				sum+= 0.5*2+2;
			}
			
			answer = 3+sum+N;
			System.out.println(answer);
		}
	}
}
