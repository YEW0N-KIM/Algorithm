package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon14215 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = br.readLine().split(" ");
		int A = Integer.parseInt(line[0]);
		int B = Integer.parseInt(line[1]);
		int C = Integer.parseInt(line[2]);
		
		int max = Math.max(A, Math.max(B, C));
		int sum = A+B+C;
		
		if(sum-max <= max) {
			sum = (sum-max)*2-1;
			System.out.println(sum);
			
		} 
		else if(sum-max>max){
			System.out.println(sum);
		}
	}
}
