package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


// 시간 초과
public class Baekjoon10815_3 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] card = br.readLine().split(" ");
		
		int M = Integer.parseInt(br.readLine());
		String[] cards = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<M; i++) {
			int a = Arrays.asList(card).contains(cards[i])==true? 1 : 0;
			sb.append(a+" ");
		}
		
		System.out.println(sb.toString().trim());
	}
}
