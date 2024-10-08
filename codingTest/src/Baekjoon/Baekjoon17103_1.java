package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon17103_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		int maxN = 1000000;
		
		
		boolean[] isPrime = new boolean[maxN+1];
		for(int i=2; i<=maxN; i++) {
			isPrime[i] = true;
		}
		
		for(int i=2; i*i<=maxN; i++) {
			if(isPrime[i]) {
				for(int j = i*i; j<maxN; j+=i) {
					isPrime[j] = false;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<T; i++) {
			int N = Integer.parseInt(br.readLine());
			int cnt = 0;
			
			for(int j=2; j<=N/2; j++) {
				if(isPrime[j] && isPrime[N-j]) cnt++;
			}
			sb.append(cnt).append("\n");
		}

		System.out.println(sb.toString().trim());
	}
}
