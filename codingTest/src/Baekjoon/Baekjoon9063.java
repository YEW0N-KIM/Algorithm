package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9063 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] x = new int[N];
		int[] y = new int[N];
		
		for(int i=0; i<N; i++) {
			String[] line = br.readLine().split(" ");
			x[i] = Integer.parseInt(line[0]);
			y[i] = Integer.parseInt(line[1]);
		}
		
		int x_min = Integer.MAX_VALUE;
		int x_max = Integer.MIN_VALUE;
		int y_min = Integer.MAX_VALUE;
		int y_max = Integer.MIN_VALUE;
		
		for(int i: x) {
			x_min = Math.min(x_min, i);
			x_max = Math.max(x_max, i);
		}
		
		for(int i: y) {
			y_min = Math.min(y_min, i);
			y_max = Math.max(y_max, i);
		}
		
		int answer = (x_max-x_min) * (y_max-y_min);
		System.out.println(answer);
		
	}
}
