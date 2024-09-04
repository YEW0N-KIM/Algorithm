package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2566 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int N = 9; int M = 9;
		int max = Integer.MIN_VALUE; int row = 0; int col= 0;
		
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			for(int j=0; j<M; j++) {
				int value = Integer.parseInt(st.nextToken());
				if(max< value) {
					max = value; row = i+1; col = j+1;
				}
			}
		}
		
		System.out.println(max);
		System.out.print(row+" "+col);
	}
}
