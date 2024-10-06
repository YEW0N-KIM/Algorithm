package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon2485 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] garosu = new int[N];
		
		for(int i=0; i<N; i++) {
			garosu[i] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(garosu);
		
		int[] dist = new int[N-1];
		for(int i=0; i<N-1; i++) {
			dist[i]=garosu[i+1]- garosu[i];
		}
		
		int divisor = 1;
		for(int i=0; i<dist.length-1; i++) {
			int a = 0; int b =0;
			if(dist[i]>dist[i+1]) {
				a = dist[i]; b = dist[i+1];
			} else {
				a = dist[i]; b = dist[i+1];
			}
			divisor = divisor(a,b);
			dist[i+1] = divisor;
		}
		
		int answer = (garosu[N-1]-garosu[0])/divisor -(N-1);
		
		System.out.println(answer);
	}
	
	public static int divisor(int a, int b) {
		while(b!=0) {
			int temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
}
