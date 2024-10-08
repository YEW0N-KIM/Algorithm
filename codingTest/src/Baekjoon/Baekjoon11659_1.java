package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon11659_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int suNo = Integer.parseInt(st.nextToken());
		int quizNo = Integer.parseInt(st.nextToken());
		
		long[] sum = new long[suNo + 1]; // 0번쩨 인덱스를 무시하고 쓰기 위해
		
		st = new StringTokenizer(bf.readLine());
		for(int i =1; i<=suNo; i++) {
			sum[i] = sum[i-1] + Integer.parseInt(st.nextToken());
		}
		
		for(int q=0; q<quizNo; q++) {
			st = new StringTokenizer(bf.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			System.out.println(sum[j]-sum[i-1]);
		}
	}
}
