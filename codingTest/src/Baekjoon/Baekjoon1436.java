package Baekjoon;

import java.util.Scanner;

public class Baekjoon1436 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num=665; int cnt = 0;
		while(true) {
			
			String a =  num+"";
			
			
			
			for(int i = 0; i<a.length(); i++) {
				if(a.length()> i+2) {
					if(a.charAt(i) == '6' && a.charAt(i+1) == '6'&& a.charAt(i+2) == '6') {
						cnt++;
						break;
					}
				}
			}
			if(cnt == N) break;
			num++;
			
			
		}
		
		System.out.println(num);
	}
}
