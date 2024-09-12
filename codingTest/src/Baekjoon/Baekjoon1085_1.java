package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1085_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int x = Integer.parseInt(line[0]);
		int y = Integer.parseInt(line[1]);
		int w = Integer.parseInt(line[2]);
		int h = Integer.parseInt(line[3]);
		
		int leftdist = x;
		int rightdist = w-x;
		int bottomdist = y;
		int topdist = h-y;
		
		int N = Math.min(Math.min(leftdist, rightdist), Math.min(topdist, bottomdist));
		
		System.out.println(N);
	}
	
}
