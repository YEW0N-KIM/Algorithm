package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9086 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
	
		for(int i=0; i<T; i++) {
			String answer = bf.readLine();
			 System.out.print(answer.charAt(0)); 
             System.out.println(answer.charAt(answer.length() - 1));
		}
	}
}
