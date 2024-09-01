package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon5597 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] student = new int[28];
		for(int i=0; i<28; i++) {
			int N = Integer.parseInt(bf.readLine());
			student[i] = N;
		}
		
		Arrays.sort(student);
		int check = 1;
		for(int i=0; i<28; i++) {
			if(check!=student[i]) {
				System.out.println(check);
				check++;
			}
			check++;
		}
		
	    // 마지막 번호 확인 (30까지)
        while (check <= 30) {
            System.out.println(check);
            check++;
        }
	}
}
