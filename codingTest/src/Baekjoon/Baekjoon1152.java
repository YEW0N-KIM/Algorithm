package Baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Baekjoon1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringTokenizer tokenizer = new StringTokenizer(s);
		System.out.println(tokenizer.countTokens());
	}
}
