package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Baekjoon28278 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			
			switch (a) {
			case 1:
				stack.add(Integer.parseInt(st.nextToken()));
				break;
			case 2:
				sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
				break;
			case 3 :
				sb.append(stack.size()).append("\n");
				break;
			case 4 :
				sb.append(stack.isEmpty() ? 1 :0 ).append("\n");
				break;
			case 5 :
				sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
			}
			
		}
		System.out.println(sb.toString().trim());
	}
}
