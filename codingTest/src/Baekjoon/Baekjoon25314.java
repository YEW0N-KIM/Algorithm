package Baekjoon;

import java.util.Scanner;

public class Baekjoon25314 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		method2(N);
		sc.close();
	}
	
	public static void method1(int N) {
		String answer = "";
		for(int i=0; i<N/4; i++) {
			answer+="long ";
		}
		
		answer+="int";
		System.out.println(answer);
	}
	
	public static void method2(int N) {
		StringBuilder answer = new StringBuilder();
		for(int i =0; i<N/4;i++) {
			answer.append("long ");
		}
		answer.append("int");
		System.out.println(answer.toString());
	}
}
