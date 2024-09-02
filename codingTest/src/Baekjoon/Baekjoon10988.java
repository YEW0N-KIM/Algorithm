package Baekjoon;

import java.util.Scanner;

public class Baekjoon10988 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean answer = false;
		String s = sc.next();
		int n = s.length()-1;
		
		for (int i =0; i<=n/2; i++) {
			if(s.charAt(i)==s.charAt(n-i)) {
				answer = true;
			} else if ((s.charAt(i)!=s.charAt(n-i))){
				answer = false;
				break;
			}
		}
		
		System.out.println(answer?1:0);
	}
}
