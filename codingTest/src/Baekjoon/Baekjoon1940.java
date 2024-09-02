package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1940 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
		
		int N = Integer.parseInt(bf.readLine());
		int M = Integer.parseInt(bf.readLine());
		String[] arr = bf.readLine().split(" ");
		
		
		int start = 0;
		int end = 0;
		int sum = Integer.parseInt(arr[start]);
		int cnt = 0;
		
		while(end<N) {

			 
			if(sum == M) {
				cnt++;
				end++;
				sum += Integer.parseInt(arr[end]);
			} else if ( sum > M) {
				sum -= Integer.parseInt(arr[start]);
				start++;
			} else if (sum < N) {
				end++;
				sum+= Integer.parseInt(arr[end]);
			}
		}
		System.out.println(cnt);
		
	}
}
