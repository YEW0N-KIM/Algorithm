package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Baekjoon10815_1 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] card = br.readLine().split(" ");
		
		HashMap<String, Integer> cards = new HashMap<>();
		for(int i=0; i<N; i++) {
			String a = card[i];
			cards.put( a, 1);
		}
		
		int M = Integer.parseInt(br.readLine());
		String[] card2 = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<M; i++) {
			int a = cards.get(card2[i])== null ? 0 :1;
			sb.append(a+" ");
		}
		
		System.out.println(sb.toString().trim());
		
	}
}
