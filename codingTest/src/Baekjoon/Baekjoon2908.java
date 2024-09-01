package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2908 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] s = bf.readLine().split(" ");
		
		method02(s);
	}
	public static void method01(String[] s) {
		String a = s[0].charAt(2)+""+s[0].charAt(1)+s[0].charAt(0);
		String b = s[1].charAt(2)+""+s[1].charAt(1)+s[1].charAt(0);
		
		System.out.println(Integer.parseInt(a)>Integer.parseInt(b)? a:b);
	}
	
	public static void method02(String[] s) {
		int a = Integer.parseInt(new StringBuilder(s[0]).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(s[1]).reverse().toString());
		System.out.println(Math.max(a, b));
	}
}
