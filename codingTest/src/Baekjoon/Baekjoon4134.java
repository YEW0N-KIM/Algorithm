package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon4134 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			long N = Long.parseLong(br.readLine().trim());
			
			while(true) {
				boolean a = decimal(N);
				if(a) {
					sb.append(N +"\n");
					break;
				}
				N++;
			}
			
		}
		
		System.out.println(sb.toString().trim());
		
	
	}
	
	public static boolean decimal(long a) {
		boolean check = true;
		for(int i=2; i * i <= a; i++) {
			if(a%i==0 || a==1) {
				check = false; break; 
			}
		}
		return check;
	}
}
