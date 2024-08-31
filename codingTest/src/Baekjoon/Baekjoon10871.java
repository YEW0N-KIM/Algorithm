package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon10871 {
	public static void main(String[] args) {
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			String[] req = bf.readLine().split(" ");
			int N = Integer.parseInt(req[0]);
			int x = Integer.parseInt(req[1]);
			String[] answer = bf.readLine().split(" ");
			
			for(int i =0; i<N; i++) {
				
				int n = Integer.parseInt(answer[i]);
				if(n<x) {
					bw.write(n+" ");
				}

			}
	
			bw.flush();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
