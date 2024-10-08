package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon4938 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		StringBuilder sb = new StringBuilder();
		
		while(true){
			int N = Integer.parseInt(br.readLine()); int cnt = 0;
			if(N==0) break;
			for(int i=N+1; i<=2*N; i++) {
				if(isPrime(i)) {
					cnt++;
				}
			}
			sb.append(cnt+"\n");
		}
		
		System.out.println(sb.toString().trim());
		
	}
	
	public static boolean isPrime(int a) {
		if(a<2) return false;
		if(a==2) return true;
		if(a%2==0) return false;
		for(int i=3; i*i<=a; i+=2) {
			if(a%i ==0) return false;
		}
		return true;
	}
}
