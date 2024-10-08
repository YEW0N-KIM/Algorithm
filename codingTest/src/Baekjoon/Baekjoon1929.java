package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1929 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		StringBuilder sb = new StringBuilder();
		
		for(int i=N; i<=M; i++) {
			if(isPrime(i)) {
				sb.append(i+"\n");
			}
		}
		System.out.println(sb.toString().trim());
	}
	
	public static boolean isPrime(int a) {
		if(a<2) return false;
		if(a==2) return true;
		if(a%2==0) return false;
		for(int i=3; i*i<=a; i+=2) {
			if(a%i==0) return false;
		}
		return true;
	}
}
