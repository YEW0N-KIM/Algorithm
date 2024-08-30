package Baekjoon;

import java.util.Scanner;

public class Baekjoon2884 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hour = sc.nextInt();
		int min = sc.nextInt();
		
		if(min <45) {
			if(hour==0) hour =24;
			hour-- ;
			
			min = 60-(45-min);
		} else if(min>=45) {
			min -= 45;
		}
		System.out.println(hour+" "+min);
	}
}
