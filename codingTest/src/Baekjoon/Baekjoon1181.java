package Baekjoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjoon1181 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] arr = new String[N];
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine();
		}
		
		arr = Arrays.stream(arr).distinct().toArray(String[] :: new );
		
		Arrays.sort(arr, new Comparator<String>() {
		@Override
		public int compare(String o1, String o2) {
			return o1.length() == o2.length() ? o1.compareTo(o2) : o1.length()-o2.length();
		}
		
		});
		
		for(String a : arr) bw.write(a+"\n");
		
		bw.flush();
		bw.close();
		
	}
}
