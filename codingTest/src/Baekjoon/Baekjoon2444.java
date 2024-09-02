package Baekjoon;

import java.util.Scanner;

public class Baekjoon2444 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i=1; i<=n; i++) {
			for(int k =n; k>i-1; k--) {
				System.out.print(" ");
			}
			
			for (int j = 1; j<=(2*i-1); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=n-1; i>=1; i--) {
			for(int k =n; k>i-1; k--) {
				System.out.print(" ");
			}
			
			for(int j = 2*i-1; j >= 1;j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
	}
}
