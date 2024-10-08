package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon9012 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
	
		
		for(int i=0; i<N; i++) {
			Stack<Character> stack = new Stack<>();
			String vps = br.readLine();
			String answer = "YES";
			
			for(int j=0; j<vps.length(); j++) {
				
				if(vps.charAt(j)=='(') {
					stack.add('(');
				} else {
					if(stack.isEmpty()) {
						answer = "NO";
					} else {
						stack.pop();
					}
				}
			}
			
			sb.append(stack.isEmpty() ? answer : "NO").append("\n");
		}
		
		System.out.println(sb.toString().trim());
	}
}
