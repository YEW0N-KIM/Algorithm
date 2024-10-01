package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;

public class Baekjoon1427 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
		
		String N = br.readLine();
		Character[] arr = new Character[N.length()];
		
		for(int i=0; i<N.length(); i++) {
			arr[i] = N.charAt(i);
		}
		
		Arrays.sort(arr, Collections.reverseOrder());
		for(char a : arr) System.out.print(a);
	}
}
