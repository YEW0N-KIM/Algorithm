package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2738 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[][] A = new int[N][M];
		int[][] B = new int[N][M];
		int[][] answer = new int[N][M];
		

		
			
		for(int j = 0; j<N ; j++) {
			st = new StringTokenizer(bf.readLine());
			for(int i=0; i<M; i++) {
				A[j][i] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int j = 0; j<N ; j++) {
			st = new StringTokenizer(bf.readLine());
			for(int i=0; i<M; i++) {
				B[j][i] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i=0; i<N; i++) {
			for(int j = 0; j<M; j++) {
				answer[i][j] = A[i][j] + B[i][j];
			}
		}
		
		for(int[] a : answer) {
			for(int b : a) {
				System.out.print(b + " "); 
			}
			System.out.println();
		}
		
	}
}

