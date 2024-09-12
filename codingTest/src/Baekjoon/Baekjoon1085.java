package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1085 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = br.readLine().split(" ");
		int x = Integer.parseInt(line[0]);
		int y = Integer.parseInt(line[1]);
		int w = Integer.parseInt(line[2]);
		int h = Integer.parseInt(line[3]);
		
		int N = x-0;
		
		if(x-0<N) N = x-0;
		if(y-0<N) N = y-0;
		if(w-x<N) N= w-x;
		if(h-y<N) N= h-y;
		
		System.out.println(N);
		
	}
}
