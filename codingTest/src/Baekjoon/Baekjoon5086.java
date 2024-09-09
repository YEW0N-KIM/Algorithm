package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon5086 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] line = br.readLine().split(" ");
			
			int A = Integer.parseInt(line[0]);
			int B = Integer.parseInt(line[1]);
			if(A==0 && B==0) break;
			
			if(B%A == 0) {
				System.out.println("factor");
			} else if(A%B == 0) {
				System.out.println("multiple");
			} else {
				System.out.println("neither");
			}
			
			
		}
		
	}
}
	