package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Baekjoon18870 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		String[] line = br.readLine().split(" ");
		
		for(int i=0; i<N; i++) {
			arr[i] = Integer.parseInt(line[i]);
		}
		
		
		int[] arr2 = Arrays.stream(arr).distinct().toArray();
		Arrays.sort(arr2);
		
		HashMap<Integer, Integer> index = new HashMap<>();
		for(int i=0; i<arr2.length; i++) {
			index.put(arr2[i], i);
		}

		StringBuilder sb = new StringBuilder();
		
		for(int a : arr) sb.append(index.get(a)).append(" ");
		System.out.println(sb.toString().trim());
		
//		for(int i=0; i<N; i++) {
//			for(int j=0; j<arr2.length; j++) {
//				if(arr[i] == arr2[j]) System.out.print(j+" ");
//			}
//		}
	}
}
