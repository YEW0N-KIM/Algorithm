package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Baekjoon1620 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] req = br.readLine().split(" ");
		
		int N = Integer.parseInt(req[0]);
		int M = Integer.parseInt(req[1]);
		
		HashMap <String, String> pocketmon = new HashMap<>();
		
		for(int i=1; i<=N; i++) {
			pocketmon.put(i+"", br.readLine());
		}
		
		for(int i=0; i<M; i++) {
			String check = br.readLine();
			for(Map.Entry<String, String> a : pocketmon.entrySet()) {
				if(a.getKey().equals(check)) {
					System.out.println(a.getValue());
				} else if(a.getValue().equals(check)){	
					System.out.println(a.getKey());
				}
			}
		}
	}
}
