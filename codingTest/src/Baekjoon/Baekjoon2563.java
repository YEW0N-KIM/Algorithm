package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


// 내가 풀었고 틀림 (겹쳐지는 부분이 중복될 때의 값을 계산하지 못함)
public class Baekjoon2563 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int answer = 10*10 * N;
		int[][] rect= new int[N][4];
		
		
		// 사각형별 좌표값 배열에 담기
		for(int i=0; i<N; i++) {
			String[] coord = br.readLine().split(" ");
			rect [i][0] = Integer.parseInt(coord[0]);
			rect [i][1] = Integer.parseInt(coord[1]);
		}
		
		int x = 0;
		int y = 0; 
		
		for(int i=0; i<N; i++) {
			int x_min = 0, x_max = 0, y_min = 0, y_max = 0;
			
			for(int j = 0; j<i; j++) {
				if(i>0) {
					if(rect[j][0]<rect[i][0]) {
						x_min = j;
						x_max = i;
					} else {
						x_min = i;
						x_max = j;
					}
					if(rect[j][1]<rect[i][1]) {
						y_min = j;
						y_max = i;
					} else {
						y_min = i;
						y_max = j;
					}
					if((rect[x_min][0]<rect[x_max][0] && rect[x_min][0]+10>rect[x_max][0])&&(rect[y_min][1]<rect[y_max][1] && rect[y_min][1]+10>rect[y_max][1])) {
						x = (rect[x_min][0]+10) - rect[x_max][0];
						y = (rect[y_min][1]+10) - rect[y_max][1];
					}
					
				}
			}
			
			if(x!=0 && y!= 0) {
				answer -= (x*y);
			}
			
		}
		System.out.println(answer);
		
	}
}
