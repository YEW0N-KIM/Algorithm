package Baekjoon;

import java.util.Scanner;

public class Baekjoon1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int layer = 1;
		
		while(N>1) {
			layer++;
			N-=layer;	
		}
		
		System.out.println(layer);
		
	}
}
