package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon17103 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			int N= Integer.parseInt(br.readLine());
			int cnt =0;
			for(int j=1; j<N/2+1; j++) {
				int a = j;
				int b = N-j;
				if(isPrime(a) == true && isPrime(b) == true) {
					cnt++;
				}
			}
			sb.append(cnt+"\n");
		}
		System.out.println(sb.toString().trim());
	}
	
	public static  boolean isPrime(int a) {
		if(a<2) return false;
		if(a==2) return true;
		if(a%2==0) return false;
		for(int i=3; i*i<=a; i+=2) {
			if(a%i==0) return false;
		}
		return true;
	}
}
