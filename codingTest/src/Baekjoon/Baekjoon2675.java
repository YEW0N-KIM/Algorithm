package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2675 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		for(int i=0; i<N; i++) {
			String[] line = bf.readLine().split(" ");
			int repeat = Integer.parseInt(line[0]);
			String word = line[1];
			
			for(int j=0; j<word.length(); j++) {
				for(int k=0; k<repeat; k++) {
					System.out.print(word.charAt(j));
				}
			}
			System.out.println();
		}
	}
}
