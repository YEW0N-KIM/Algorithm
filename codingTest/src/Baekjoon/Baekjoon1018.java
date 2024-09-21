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
		
		char[][] chess = new char[M][N];
		char[][] chess2 = new char[M][N];
		
		// 두개의 체스판 만들기
		for(int i=0; i<M;i++) {
			
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
			for(int j=0; j<N; j++) {
				
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
		
		// 비교하기
		int chesscheck = 0;
		int chess2check = 0;
		
		for(int i=0; i<M; i++) {
			String line = br.readLine();
			for(int j=0; j<N; j++) {
				if(line.charAt(j) != chess[i][j]) {
					chesscheck ++;
				}
				if(line.charAt(j) != chess2[i][j]) {
					chess2check ++;
				}
			}
		}
		
		System.out.println(chesscheck<chess2check ? chesscheck: chess2check);		
		System.out.println(chesscheck);
		System.out.println(chess2check);
		
	}
}
