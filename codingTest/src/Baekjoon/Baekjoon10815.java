package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


// 시간 초과함
public class Baekjoon10815 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 상근이 카드
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		String[] line = br.readLine().split(" ");
		
		for(int i=0; i<N; i++) {
			arr[i] = line[i];
		}
		
		// 비교할 카드
		int M = Integer.parseInt(br.readLine());
		String[] line2 = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		
		// 비교
		for(int i=0; i<M; i++) {	
			int a = Arrays.asList(arr).indexOf(line2[i])==-1 ? 0 : 1 ;
			sb.append(a+" ");
		}
		System.out.println(sb.toString().trim());
		
	}
}
