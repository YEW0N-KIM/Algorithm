package Baekjoon;

import java.util.Scanner;

public class Baekjoon2798 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int max = 0;
		
		int[] card = new int[N];
		for(int i=0; i<N; i++) {
			card[i] = sc.nextInt();
		}
		
		for(int i=0; i<N-2; i++) {
			for(int j=i+1; j<N-1; j++) {
				for(int k=j+1; k<N; k++) {
					int sum = card[i] + card[j]+ card[k];
					if(sum>max && sum<=M) {
						max = sum;
					}
				}
			}
		}
		
		System.out.println(max);
	}
}
