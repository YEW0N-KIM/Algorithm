package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Baekjoon1764 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] req = br.readLine().split(" ");
		int N = Integer.parseInt(req[0]);
		int M = Integer.parseInt(req[1]);
		
		HashSet<String> hear = new HashSet<>();
		HashSet<String> result = new HashSet<>();
		
		for(int i=0; i<N; i++) {
			hear.add(br.readLine());
		}
		
		for(int i=0; i<M; i++) {
			String a = br.readLine();
			if(hear.contains(a)) {
				result.add(a);
			}
		}
		
		ArrayList<String> answer = new ArrayList<>(result);
		Collections.sort(answer);
		
		System.out.println(answer.size());
		for(int i= 0; i< answer.size(); i++) {
			System.out.println(answer.get(i));
		}
		
		
	}
}
