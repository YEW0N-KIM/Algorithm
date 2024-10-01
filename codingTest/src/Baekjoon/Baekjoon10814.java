package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjoon10814 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String [][] arr = new String[N][2];
		
		for(int i =0; i<N; i++) {
			String[] line = br.readLine().split(" ");
			arr[i][0] = line[0];
			arr[i][1] = line[1];
		}
		
		Arrays.sort(arr, new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				int age1 = Integer.parseInt(o1[0]);
				int age2 = Integer.parseInt(o2[0]);
				
				if(age1!=age2) return age1-age2;
				else return 0;
				
			}
		});
		
		for(String[] a : arr) {
			for(String b : a)  bw.write(b+" ");
			bw.write("\n");
		}
		bw.flush();
		bw.close();
		
	}
}
