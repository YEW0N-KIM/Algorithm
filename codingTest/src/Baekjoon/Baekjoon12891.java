package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon12891 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String[] req = bf.readLine().split(" ");
		
		int s = Integer.parseInt(req[0]);
		int p = Integer.parseInt(req[1]);
		
		// 임의로 만든 DNA 배열
		char[] dna = bf.readLine().toCharArray();
		
		// 필요 조건
		String[] req2 = bf.readLine().split(" ");
		
		int start = 0;
		int end = start+p;
		
		int answer = 0;
		
		while(end<=s) {
			int Acnt = 0; int Ccnt = 0; int Gcnt = 0; int Tcnt = 0;
			for(int i=0; i<end; i++) {
				
				if(dna[i] =='A') {
					Acnt++;
				} if(dna[i] =='C') {
					Ccnt++;
				}if(dna[i] =='G') {
					Gcnt++;
				} if(dna[i] =='T') {
					Tcnt++;
				}
			}
			
			if(Acnt>=Integer.parseInt(req2[0]) && Ccnt>=Integer.parseInt(req2[1]) && Gcnt>=Integer.parseInt(req2[2]) && Tcnt>=Integer.parseInt(req2[3])) {
				answer++;
			}
			start++;
			end++;
		}
		
		System.out.println(answer);
	}
}
