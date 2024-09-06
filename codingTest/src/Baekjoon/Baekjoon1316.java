package Baekjoon;

import java.util.Scanner;

public class Baekjoon1316 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 0;
		
		
		for(int i=0; i<N; i++) {
			String word = sc.next();
	
			if(method01(word)) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}
	
	public static boolean method01(String word) {
		
		boolean[] alph = new boolean[26];
		boolean isGroup = true;
		
		for(int j=0; j<word.length(); j++) {
			char current = word.charAt(j);
			
			if(j>0 && word.charAt(j-1)!= current ) {
			
				if(alph[current-'a']) {
					isGroup = false;
					break;
				}
			}
			
			alph[current-'a'] = true;
			
		}
		
		return isGroup;
	}
}
