package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Baekjoon10815_2 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] card = br.readLine().split(" ");
		
		HashSet<String> cards = new HashSet<>();
		for(int i=0; i<N; i++) {
			cards.add(card[i]);
		}
		
		int M = Integer.parseInt(br.readLine());
		String[] card2 = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<M; i++) {
			int a = cards.contains(card2[i])== true ? 1 :0;
			sb.append(a+" ");
		}
		
		System.out.println(sb.toString().trim());
	}
}
