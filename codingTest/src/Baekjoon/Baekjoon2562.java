package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon2562 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int cnt = 1, max = Integer.parseInt(bf.readLine()) ;
		for (int i=2; i<=9; i++) {
			int su = Integer.parseInt(bf.readLine());
			if(su>max) {
				max = su;
				cnt = i;
			}
		}	
        System.out.println(max);
        System.out.println(cnt);
	}
}
