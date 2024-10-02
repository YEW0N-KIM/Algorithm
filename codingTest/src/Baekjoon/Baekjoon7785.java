package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Baekjoon7785 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		LinkedHashMap<String, String> record = new LinkedHashMap<>();
		for(int i=0; i<N; i++) {
			String[] line = br.readLine().split(" ");
			
			if(line[1].equals("enter")) {
				record.put(line[0], line[1]);
				
			} else if(line[1].equals("leave")) {
				record.remove(line[0]);
			}
			
		}
		
//		for(Map.Entry<String, String> a : record.entrySet()) {
//			if(a.getValue().equals("enter")) {
//				System.out.println(a.getKey());
//			} 
//		}
		for (Map.Entry<String, String> entry : record.entrySet()) {
            System.out.println(entry.getKey());
        }
		
	}
}
