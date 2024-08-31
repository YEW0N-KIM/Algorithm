package Baekjoon;

import java.util.Scanner;

public class Baekjoon2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
//		method01(N);
		method02(N);
	}
	
	public static void method01(int N) {
		for(int i=0; i<N; i++) {
			for(int k=(N-1); k>i; k--) {
				System.out.print(" ");
			}
			
			for(int j=0; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void method02(int N) {

		  for (int i = 1; i <= N; i++) {
	            // 공백과 별을 결합하여 출력
	            StringBuilder line = new StringBuilder();
	            for (int k = 0; k < N - i; k++) {
	                line.append(" "); // 공백 추가
	            }
	            for (int j = 0; j < i; j++) {
	                line.append("*"); // 별 추가
	            }
	            System.out.println(line); // 한 줄 출력
	        }
	    }
}
