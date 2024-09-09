package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2869 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] req = br.readLine().split(" ");
		
		int A = Integer.parseInt(req[0]);
		int B = Integer.parseInt(req[1]);
		int V = Integer.parseInt(req[2]);
		
		method01(A, B, V);
		method02(A, B, V);
		
		
		
	}
	// 내가 푼 반복문 코드 => 시간 초과 발생
	public static void method01(int A, int B, int V) {
		int day = 0;
		int sum = 0;
		while(sum<V) {
			sum+=A;
			if(sum<V) {
				sum-=B;
			}
			day++;
		}
		
		System.out.println(day);
	}
	
	public static void method02(int A, int B, int V) {
		int day = (V-B) / (A-B);
		if((V-B)%(A-B) !=0) {
			day++;
		}
		System.out.println(day);
	}
}
