package baekjun;

import java.util.Scanner;

public class 문제1546 {
	
	
	public static void main(String[] args) {
//		method1();
//		method2();
		method3();
	
	}
	
	public static void method1() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] score = new int[N];
		double max = 0;
		
		// 최대값 찾기
		for(int i=0; i<N; i++) {
			score[i] = sc.nextInt();
			if(max<score[i]) {
				max = score[i];
			}
		}
		
		
		// 평균계산
		double avg = 0;
		for(int i=0; i<N; i++) {
			avg += (score[i]/max)*100;
		}
		
		System.out.println(avg/N);
	}
	
	public static void method2() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] score = new int[N];
		double max = 0;
		double sum = 0;
		for(int i =0; i<N; i++) {
			score[i] = sc.nextInt();
			max = max<score[i]? score[i] : max;
			sum += score[i];
		}
		sum = sum/max*100;
		
		System.out.println(sum/N);
	}
	
	public static void method3() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double max = 0;
		double sum = 0;
		for(int i=0; i<N; i++) {
			int value = sc.nextInt();
			max = max<value? value : max;
			sum+=value;
		}
		System.out.println(sum/max*100/N);
	}
}
