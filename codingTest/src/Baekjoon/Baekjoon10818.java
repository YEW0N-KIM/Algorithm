package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon10818 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int firstNumber = Integer.parseInt(st.nextToken()); 
		int max= firstNumber, min = firstNumber;
		
		for(int i =1; i<N; i++) {
			int su = Integer.parseInt(st.nextToken());
			if (max<su) max = su;
			if (min>su) min = su;
		}
		
		System.out.println(min +" "+ max);
	}
}
