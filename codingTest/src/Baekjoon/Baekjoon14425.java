package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Baekjoon14425 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] req = br.readLine().split(" ");
		int N = Integer.parseInt(req[0]);
		int M = Integer.parseInt(req[1]);
		
		HashSet<String> word = new HashSet<>();
		for(int i=0; i<N; i++) {
			word.add(br.readLine());
		}
		
		
		int check = 0;
		
		
		for(int i=0; i<M; i++) {
			String checkword = br.readLine();
			if( word.contains(checkword)) check++;
		}
		
		System.out.println(check);
	}
}
