package Baekjoon;

import java.util.ArrayList;
import java.util.Scanner;

public class Baekjoon11653 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		// 배열에 소수 담기
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=2; i<N; i++) {
			if(isPrime(i)) list.add(i);
		}
		
		for(int i=0; i<list.size();) {
			if(N % list.get(i) == 0) {
				N/=list.get(i);
				System.out.println(list.get(i));
			} else if(N%list.get(i) != 0 ) {
				i++;
			}
		}
			
	}
	
	private static boolean isPrime(int value) {
		if(value<2) return false;
		for(int i=2; i<Math.sqrt(value); i++) {
			if(value % i ==0) return false;
		}
		return true;
	}
}
