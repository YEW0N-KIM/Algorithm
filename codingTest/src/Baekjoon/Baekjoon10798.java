package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10798 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		char[][] req = new char[5][15];  
		
		// 2차원 배열에 값 담기
		for(int i=0; i<5; i++) {		
			String word = bf.readLine();

			for(int j  = 0; j< word.length(); j++) {
				req [i][j] = word.charAt(j);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i< 15; i++) {
			for(int j = 0; j<5; j++) {
				if(req[j][i] != 0) {
					sb.append(req[j][i]);
				}
				
			}
		}
		
		System.out.println(sb.toString());
	}
}
