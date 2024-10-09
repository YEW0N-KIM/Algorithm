package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon4949 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			String sentence = br.readLine();
			Stack<Character> vps = new Stack<>();
			if(sentence.equals(".")) break;
			
			String answer = "yes";
			
			for(int i=0; i<sentence.length(); i++) {
				char check = sentence.charAt(i);
				
				// 열린 괄호
				if(check == '(') vps.add('(');
				else if( check == '[')  vps.add('[');
				
				// 닫힌 괄호		
				if(check == ')') {
					if(vps.isEmpty()) {
						 answer = "no";	break;
					} else {
						if(vps.peek() == '(') vps.pop();
						else { answer = "no"; break; }
					}
					
				} else if(check == ']') {
					if(vps.isEmpty()) {
						 answer = "no";	break;
					} else {
						if(vps.peek() == '[') vps.pop();
						else {	answer = "no"; break; }
					}

				}
			}
			
			sb.append(vps.isEmpty()? answer : "no").append("\n");
		}
		
		System.out.println(sb.toString().trim());
	}
}
