package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon9063_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int x_min = Integer.MAX_VALUE;
		int x_max = Integer.MIN_VALUE;
		int y_min = Integer.MAX_VALUE;
		int y_max = Integer.MIN_VALUE;
		
		for(int i=0; i<N; i++) {
			String[] line = br.readLine().split(" ");
			int x = Integer.parseInt(line[0]);
			int y = Integer.parseInt(line[1]);
			
			x_min = Math.min(x_min, x);
			x_max = Math.max(x_max, x);
			y_min = Math.min(y_min, y);
			y_max = Math.max(y_max, y);
			
		}
		
		int answer = (x_max-x_min) * (y_max-y_min);
		System.out.println(answer);
		
	}
}
