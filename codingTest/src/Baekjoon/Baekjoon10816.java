package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Baekjoon10816 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] card = br.readLine().split(" ");
		
		HashMap<Integer, Integer> cards = new HashMap<>();
		
		for(int i=0; i<N;i++) {
			int a = Integer.parseInt(card[i]);
			
			if(cards.get(a) != null) {
				cards.put(a, cards.get(a)+1);
			} else {
				cards.put(a, 1);
			}
			
		}
		
		int M = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		String[] check = br.readLine().split(" ");
		
		for(int i=0; i<M; i++) {
			int result = cards.get(Integer.parseInt(check[i])) == null? 0 :cards.get(Integer.parseInt(check[i]));
			sb.append(result+ " ");
		}
		
		System.out.println(sb.toString().trim());
	}
}
