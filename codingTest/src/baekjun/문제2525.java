package baekjun;

import java.util.Scanner;

public class 문제2525 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		int time = sc.nextInt();
		
		min += time;
		hour+=min/60; min=min%60;
		hour%=24;
			
		System.out.println(hour +" "+ min);
	}
}	
