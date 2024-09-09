package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1978_1 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		
		int answer = 0;
		
		for(int i=0; i<N; i++) {
			int value = Integer.parseInt(arr[i]);
			
			if(isPrime(value)) {
				answer++;
			}
		}
		System.out.println(answer);
	}
	
	private static boolean isPrime(int value) {
		if(value<2) return false;
		for(int i=2; i<=Math.sqrt(value); i++) {
			if(value%i ==0) return false;
		}
		return true;
	}
}
