package Baekjoon;

import java.util.Scanner;

public class Baekjoon2839 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int min = Integer.MAX_VALUE;
		
		int rest = 0;
		
		int kg5 = 0;
		int kg3 = 0;
		
		if((N%5)%3 == 0) {
			kg5  = N/5;
			rest = N%5;
			kg3 = rest/3;
		} else {
			if(N/5 != 0) {
				kg5 = N/5-1;
				if((N - kg5*5) %3 ==0) {
					rest = N - kg5*5;
					kg3 = rest/3;
				}
			}
			
			if(rest == 0 ) kg3 = N/3;
			
		}
		
		System.out.println(kg5*5 + kg3*3 !=N? -1:kg5+kg3);
	
	}
}
