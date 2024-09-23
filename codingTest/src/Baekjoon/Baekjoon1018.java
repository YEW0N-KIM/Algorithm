package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1018 {
	public static void main(String[] args) throws IOException{
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] req = br.readLine().split(" ");
		
		int M = Integer.parseInt(req[0]);
		int N = Integer.parseInt(req[1]);
		
		char[][] chess = new char[8][8];
		char[][] chess2 = new char[8][8];
		
		// 비교할 두개의 체스판 만들기
		for(int i=0; i<8;i++) {
			
			chess[0][0] = 'W';
			chess2[0][0] = 'B';
			
			if(i!=0) {
				if(chess[i-1][0] == 'W') {
					chess[i][0] = 'B';
				} else if(chess[i-1][0] == 'B') {
					chess[i][0] = 'W';
				}
				
				if(chess2[i-1][0] == 'W') {
					chess2[i][0] = 'B';
				} else if(chess2[i-1][0] == 'B') {
					chess2[i][0] = 'W';
				}
			}
			
			for(int j=0; j<8; j++) {
				
				if(j!=0) {
					if(chess[i][j-1] == 'W') {
						chess[i][j] = 'B';
					} else if(chess[i][j-1] == 'B'){
						chess[i][j] = 'W';
					}
					
					if(chess2[i][j-1] == 'W') {
						chess2[i][j] = 'B';
					} else if(chess2[i][j-1] == 'B'){
						chess2[i][j] = 'W';
					}
				}
				
			}
		}
		
		// 받은 체스판
		char[][] input = new char[M][N];
		for(int i=0; i<M; i++) {
			String line = br.readLine();
			for(int j=0; j<N; j++) {
				input[i][j] = line.charAt(j);
			}
		}
		
		// 비교
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<=M-8; i++) {
			for(int j=0; j<=N-8; j++) {
				int checkchess = 0;
				int checkchess2 = 0;
				
				for(int x=0; x<8; x++) {
					for(int y =0; y<8; y++) {
						if(input[i+x][j+y]!= chess[x][y]) {
							checkchess ++;
						}
						if(input[i+x][j+y]!= chess2[x][y]) {
							checkchess2 ++;
						}
					}

				}
				int a = checkchess<checkchess2? checkchess : checkchess2;
				if(min>a) {
					min = a;
				}
			}
		}
		
		System.out.println(min);
		
	}
}
