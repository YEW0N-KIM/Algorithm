package Baekjoon;

import java.util.Scanner;

public class Baekjoon1436_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 665;
		int cnt = 0;
		
		while(true) {
			if(String.valueOf(num).contains("666")) {
				cnt ++;
				if(cnt == N) break;
			}
			num ++;
		
		}
		
		System.out.println(num);
	}
}
