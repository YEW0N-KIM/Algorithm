package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon12789 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		String[] line = br.readLine().split(" ");
		Stack<Integer> origin = new Stack<>();
		Stack<Integer> temp = new Stack<>();
		int cnt = 1;
		String answer = "Nice";
		
		for(int i=0; i<N; i++) {
			origin.push(Integer.parseInt(line[i]));
		}
		

		
		System.out.println(answer);
		
		
	}
}
