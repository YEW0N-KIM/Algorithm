package Baekjoon;

import java.util.Scanner;

public class Baekjoon13909 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		boolean[] window = new boolean[N+1];
		for(int i = 1; i<=N; i++) {
			window[i] = true;
		}
		
		for(int i=2; i<=N; i++) {
			
			for(int j= i; j<=N; j+=i) {
				if(window[j]) window[j] = false;
				else window[j] = true;
			}
			

		}
		
		int cnt = 0;
		for(int i=1; i<=N; i++) {
			if(window[i] == true) cnt++;
		}
		
		System.out.println(cnt);
	}
}
