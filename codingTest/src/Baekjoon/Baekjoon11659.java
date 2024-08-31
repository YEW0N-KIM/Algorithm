package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon11659 {
	public static void main (String[] args) throws IOException {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] req = bf.readLine().split(" ");
		int N = Integer.parseInt(req[0]);
		int M = Integer.parseInt(req[1]);
		int[] sum = new int[N];
		
		String[] arr = bf.readLine().split(" ");
		for(int i =1; i<N; i++) {
			sum[0] = Integer.parseInt(arr[0]);
			sum[i] = sum[i-1]+Integer.parseInt(arr[i]);
		}
		
		int answer = 0;
		
		for(int i = 0; i<M; i++) {
			String[] req2 = bf.readLine().split(" ");
			int a = Integer.parseInt(req2[1])-1;
			int b = Integer.parseInt(req2[0])-2;
			
			if (Integer.parseInt(req2[0]) ==1) answer = sum[a];
			else {

				answer = sum[a] - sum[b];
			}
			bw.write(answer+"\n");
		}
		
		bw.flush();
		bw.close();
	}
}
