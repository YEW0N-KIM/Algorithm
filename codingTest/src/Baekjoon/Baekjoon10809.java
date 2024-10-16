package Baekjoon;

import java.util.Scanner;
public class Baekjoon10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] answer = new int[26];
		
		for(int i=0; i<answer.length; i++) {
			answer[i] = -1;
		}
		
		for(int i=0; i<s.length();i++) {
			char c = s.charAt(i);
			int index =  c - 'a';
			if(answer[index]== -1) {
				answer[index] = i;
			}
		}
		
		for(int a : answer) {
			System.out.print(a+" ");
		}
	}
}
