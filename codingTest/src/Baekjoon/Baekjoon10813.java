package Baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Baekjoon10813 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		int[] basket = new int[N];
		for(int i =1; i<=N; i++) {
			basket[i-1] = i;
		}
		
		for (int i = 0; i<M; i++ ) {
			st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			int temp = 0;
			
			temp = basket[a];
			basket[a] = basket[b];
			basket[b] = temp;
		}
		
		StringBuilder result = new StringBuilder();
		for(int a : basket) {
			result.append(a).append(" ");
		}
		System.out.println(result.toString().trim());
	}
}
