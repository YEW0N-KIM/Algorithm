package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baekjoon2501 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		
		int N = Integer.parseInt(line[0]);
		int K = Integer.parseInt(line[1]);
		ArrayList<Integer> list = new ArrayList<>();
		int answer = 0;
		
		for(int i=1; i<=N; i++) {
			int divisor = N%(i);
			if( divisor == 0) {
				list.add(i);
			}
		}
		
		if( K > list.size()){
			answer = 0;
		} else {
			answer = list.get(K-1);
		}
		
		System.out.println(answer);
	}
}
