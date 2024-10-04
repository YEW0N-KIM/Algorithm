package Baekjoon;

import java.util.HashSet;
import java.util.Scanner;

public class Baekjoon11478 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next().trim();
		int n = s.length();
		HashSet<String> word = new HashSet<>();
		
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<=n; j++) {
					word.add(s.substring(i,j));
			}
		}
		
		System.out.println(word.size());
	}
}
