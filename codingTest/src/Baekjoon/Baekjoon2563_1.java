package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2563_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		boolean[][] paper = new boolean[101][101];
		int area = 0;
		
		for(int i=0; i<N; i++) {
			String[] coord = bf.readLine().split(" ");
			int x = Integer.parseInt(coord[0]);
			int y = Integer.parseInt(coord[1]);
			
			for(int j=x; j<x+10; j++) {
				for (int k = y; k < y + 10; k++) {
			        if (!paper[j][k]) {
			            paper[j][k] = true; // 해당 위치에 색종이가 놓였음을 표시
			            area++; // 면적 증가
			        }
			    }
			}
		}
		System.out.println(area);
		
	}
}
