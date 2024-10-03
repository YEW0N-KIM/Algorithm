package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Baekjoon1620_1 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] req = br.readLine().split(" ");
		int N = Integer.parseInt(req[0]);
		int M = Integer.parseInt(req[1]);
		
		HashMap<String, String> pocketmon = new HashMap<>();
		HashMap<String, String> pocketmon2 = new HashMap<>();
		
		for(int i=1; i<=N; i++) {
			String a = br.readLine();
			pocketmon.put(i+"", a);
			pocketmon2.put(a, i+"");
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<M; i++) {
			String a = br.readLine();
			String result = pocketmon.get(a)==null ? pocketmon2.get(a) : pocketmon.get(a);
			sb.append(result+"\n");
		}
		
		System.out.println(sb.toString().trim());
	}
}
