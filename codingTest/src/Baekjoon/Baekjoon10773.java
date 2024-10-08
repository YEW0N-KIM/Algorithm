package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon10773 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Stack<Integer> stack = new Stack<>();
		for(int i=0; i<N; i++) {
			int a = Integer.parseInt(br.readLine());
			if(a == 0) {
				if(stack.isEmpty() ==false) stack.pop();
			} else {
				stack.add(a);
			}
		}
		
		int sum = 0;
		for(int i=0; i<stack.size(); i++) {
			sum+=stack.get(i);
		}
		
		System.out.println(sum);
	}
}
