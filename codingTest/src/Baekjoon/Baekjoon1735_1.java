package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon1735_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line1 = br.readLine().split(" ");
		String[] line2 = br.readLine().split(" ");
		
		int A = Integer.parseInt(line1[0]);
		int B = Integer.parseInt(line1[1]);
		int C = Integer.parseInt(line2[0]);
		int D = Integer.parseInt(line2[1]);
		
		int x = B*D;
		int y = A*D + B*C;
		
		int divisor = divisor(x, y);
		System.out.println(y/divisor +" "+x/divisor);
		
		
	}
	
	public static int divisor(int a, int b) {
		while(b!=0) {
			int temp = b;
			b = a%b;
			a= temp;
		}
		return a;
	}
}
