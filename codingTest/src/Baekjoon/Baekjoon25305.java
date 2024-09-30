package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Baekjoon25305 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] req = br.readLine().split(" ");
		int N = Integer.parseInt(req[0]);
		int k = Integer.parseInt(req[1]);
		
		Integer[] arr = new Integer[N];
		String[] line = br.readLine().split(" ");
		
		for(int i=0; i<N; i++) {
			arr[i]  = Integer.parseInt(line[i]); 
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		
		System.out.println(arr[k-1]);
	}
}
