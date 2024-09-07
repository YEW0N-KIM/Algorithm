package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2720 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int[] answer = new int[4];
		
		for(int i=0; i<T; i++) {
			int  change = Integer.parseInt(br.readLine());
			answer[0] = change / 25;
			change %= 25;
			answer[1] = change / 10;
			change %= 10;
			answer[2] = change / 5;
			change %= 5;
			answer[3] = change / 1;
			change %= 1;
			
			for(int a : answer) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
		
	}
}
