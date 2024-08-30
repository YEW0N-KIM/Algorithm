package Baekjoon;

import java.util.Scanner;

public class Baekjoon2480 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = 0;
		
		if(a==b && b==c) System.out.println(10000+a*1000);
		else if(a!= b&& b!=c && a!=c) {
			max = a>b? (a>c? a:c):(b>c? b:c);
			System.out.println(max*100);
		} else if(a==b || b==c ||a==c) {
			int same = a==b? a : b==c? b: c;
			System.out.println(1000+same*100);
		}
	}

}
