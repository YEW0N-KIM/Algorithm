package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon5073_1 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String[] line = br.readLine().split(" ");
			int side1 = Integer.parseInt(line[0]);
			int side2 = Integer.parseInt(line[1]);
			int side3 = Integer.parseInt(line[2]);
			int max_side = Math.max(Math.max(side1, side2), side3);
			int min_side = Math.min(Math.min(side1, side2), side3);
			int mid_side = Math.min(Math.max(side1, side2), side3);
			
			
			
			if(side1 == 0 && side2 ==0 && side3 ==0) break;
			
			
			if(max_side >= min_side+mid_side) {
				System.out.println("Invalid");
			} else if(side1 == side2 && side1==side3 && side2 ==side3) {
				System.out.println("Equilateral");
			} else if(side1 != side2 && side1 !=side3 && side2!=side3) {
				System.out.println("Scalene");
			} else {
				System.out.println("Isosceles");
			}
		}
	}
}
