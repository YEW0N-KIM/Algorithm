package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon13241 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] list = br.readLine().split(" ");
		long B = Integer.parseInt(list[0]);
		long N = Integer.parseInt(list[1]);
		long min = 1;
		for(int i=1; i<=N; i++) {
			if(N%i == 0 && B%i ==0) {
				min = i;
			}
		}
		System.out.println((long)B*N/min);
	}
}
