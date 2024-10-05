package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1735 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line1 = br.readLine().split(" ");
		int A = Integer.parseInt(line1[0]);
		int B = Integer.parseInt(line1[1]);
		
		String[] line2 = br.readLine().split(" ");
		int C = Integer.parseInt(line2[0]);
		int D = Integer.parseInt(line2[1]);
		
		int x = (A*D) + (B*C);
		int y = B * D;
		
		for(int i=1; i<=(x>y? x:y); i++) {
			if(x%i==0 && y%i==0) {
				x/=i; y/=i;
			}
		}
		
		System.out.println(x +" "+ y);
	}
}
