package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1934 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<T; i++) {
			int min = 0;
			
			String[] line = br.readLine().split(" ");
			int a = Integer.parseInt(line[0]);
			int b = Integer.parseInt(line[1]);
			int c = a>b ? a:b;
			
			
			for(int j=1; j<=c;  j++) {
				if(a%j == 0 && b%j==0) min = j;
			}
			
			sb.append(a*b/min +"\n");
		}
		
		System.out.println(sb.toString());
	}
	
}
