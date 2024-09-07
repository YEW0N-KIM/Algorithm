package Baekjoon;

import java.util.Scanner;

public class Baekjoon2292 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int target = sc.nextInt();
		int cnt = 1;
		int current = 1;
		
		if(target ==1) {
			System.out.println(cnt);
			return;
		}
		
		while(current<target) {
			current += 6 * cnt;
			cnt++;
		}
		
		System.out.println(cnt);
	}
}