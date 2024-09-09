package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Baekjoon9506 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			
			int sum = 0;
			int N = Integer.parseInt(br.readLine());
			if(N ==-1) break;
			
			// 약수 배열에 담기, 완전수 구하기
			for(int i=1; i<N; i++) {
				if(N%i ==0) {
					list.add(i);
					sum += i;
				}
			}
			
			// 
			StringBuilder sb = new StringBuilder();
			sb.append(N);
			if (sum == N) {
				sb.append(" = ");
				for(int i=0; i<list.size(); i++) {
					sb.append(list.get(i));
					if(i != list.size()-1) {
						sb.append(" + ");
					}
				}
			} else {
				sb.append(" is NOT perfect.");
			}
			System.out.println(sb);
		}
		

	}
}
