package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1978 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] arr = br.readLine().split(" ");
		
		int answer = 0;
		
		for(int i=0; i<N; i++) {
			int value = Integer.parseInt(arr[i]);
			int cnt = 0;
			
			for(int j=1; j<=value; j++) {
				if(value % j == 0) cnt++;
			}
			
			if(cnt == 2) answer++;
		}
		
		System.out.println(answer);
	}
}
