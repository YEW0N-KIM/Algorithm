package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2745 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		String N = st.nextToken();
		long B = Integer.parseInt(st.nextToken());
		int answer = 0;

		
		for(int i=0; i<N.length(); i++) {
			char c = N.charAt(N.length()-i-1);
			int value = 0;
			if(Character.isDigit(c)) {
				value = c -'0';
			} else {
				value = c- 'A' +10;
			}
			answer += value * Math.pow(B, i);
		}
		
		System.out.println(answer);
	}
}
