package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon3052 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] remain = new int[10];
		for(int i = 0; i<10; i++) {
			int N = Integer.parseInt(bf.readLine());
			remain[i] = N%42;
		}
		
		remain = Arrays.stream(remain).distinct().toArray();
		System.out.println(remain.length);
	}
}
