package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon10811 {
	public static void main (String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String[] req = bf.readLine().split(" ");
		int N = Integer.parseInt(req[0]);
		int M = Integer.parseInt(req[1]);
		
		int[] basket = new int[N];
		for(int i=1; i<=N; i++) {
			basket[i-1] = i;
		}
		
		for(int i = 0; i<M; i++) {
			String[] index = bf.readLine().split(" ");
			int start = Integer.parseInt(index[0])-1;
			int end = Integer.parseInt(index[1])-1;
	
			while(start<end) {
				int temp = basket[end];
				basket[end] = basket[start];
				basket[start] = temp;
				start ++;
				end--;
			}
			
		}
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++) {
			sb.append(basket[i]).append(" ");
		}
		System.out.println(sb.toString().trim());
	}
}
