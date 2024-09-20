package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon19532_1 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line =  br.readLine().split(" ");
		
		long a = Long.parseLong(line[0]);
		long b = Long.parseLong(line[1]);
		long c = Long.parseLong(line[2]);
		long d = Long.parseLong(line[3]);
		long e = Long.parseLong(line[4]);
		long f = Long.parseLong(line[5]);
	
		
		long y = (f-(d*c/a))/ (e-b*d/a) ;
		long x = (c - b*y) / a;
		
		System.out.println(x+" "+y);
		
	}
}
