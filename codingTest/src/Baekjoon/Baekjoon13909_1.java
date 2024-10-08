package Baekjoon;

import java.util.Scanner;

// 약수가 홀수개일 경우 창문이 열린다. -> 약수가 홀수개 인것 = 제곱수 
public class Baekjoon13909_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int cnt = 0;
		for(int i=1; i*i<=N; i++) {
			cnt++;
		}
		
		System.out.println(cnt);
	}
}
