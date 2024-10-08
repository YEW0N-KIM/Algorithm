package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon19532_1 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line =  br.readLine().split(" ");
		
		int a = Integer.parseInt(line[0]);
		int b = Integer.parseInt(line[1]);
		int c = Integer.parseInt(line[2]);
		int d = Integer.parseInt(line[3]);
		int e = Integer.parseInt(line[4]);
		int f = Integer.parseInt(line[5]);
	

		// 가감법 이용
		long x = (long)(e*c-b*f) / (a*e-b*d);
		long y = (long)(c*d-a*f) / (b*d-a*e);
		
		System.out.println(x+" "+y);
	}
}
