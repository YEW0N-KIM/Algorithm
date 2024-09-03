package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon12891_1 {
	
	static int[] dna_cnt;
	static String [] req_cnt;
	static int checkSecret;
	
	public static void main (String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] req = bf.readLine().split(" ");
		int S = Integer.parseInt(req[0]); // 문자열 길이
		int P = Integer.parseInt(req[1]); // 만들 비밀번호 길이
		int Result = 0;
		checkSecret = 0;
		
		char[] dna = bf.readLine().toCharArray(); // 문자 배열
		
		
		req_cnt =   bf.readLine().split(" "); // 필요 갯수
		for(int i=0; i<4; i++) {
			if(Integer.parseInt(req_cnt[i])==0) checkSecret++;
		}
		dna_cnt = new int[4];
		
		for(int i= 0; i<P; i++) { // 부분 문자열 처음 받을 때 세팅
			Add(dna[i]);
		}
		if(checkSecret == 4) Result ++;
		
		// 슬라이딩 윈도우
		for(int i=P; i<S; i++) {
			int j = i-P;
			Add(dna[i]);
			Remove(dna[j]);
			if(checkSecret == 4) Result ++;
		}
		System.out.println(Result);
		bf.close();
	}
	
	private static void Add(char c) {
		switch (c) {
		case 'A' : 
			dna_cnt[0]++;
			if(dna_cnt[0] == Integer.parseInt(req_cnt[0])) {
				checkSecret++;
			}
		break;
		case 'C' : 
			dna_cnt[1]++;
			if(dna_cnt[1] == Integer.parseInt(req_cnt[1])) {
				checkSecret++;
			}
		break;
		case 'G' : 
			dna_cnt[2]++;
			if(dna_cnt[2] == Integer.parseInt(req_cnt[2])) {
				checkSecret++;
			}
		break;
		case 'T' : 
			dna_cnt[3]++;
			if(dna_cnt[3] == Integer.parseInt(req_cnt[3])) {
				checkSecret++;
			}
		break;
		}
	}
	
		private static void Remove(char c) {
			switch (c) {
			case 'A' : 
				if(dna_cnt[0] == Integer.parseInt(req_cnt[0])) {
					checkSecret--;
				}
				dna_cnt[0]--;
			break;
			case 'C' : 
				if(dna_cnt[1] == Integer.parseInt(req_cnt[1])) {
					checkSecret--;
				}
				dna_cnt[1]--;
			break;
			case 'G' : 
				if(dna_cnt[2] == Integer.parseInt(req_cnt[2])) {
					checkSecret--;
				}
				dna_cnt[2]--;
			break;
			case 'T' : 
				if(dna_cnt[3] == Integer.parseInt(req_cnt[3])) {
					checkSecret--;
				}
				dna_cnt[3]--;
			break;
		}	
		
	}
}
