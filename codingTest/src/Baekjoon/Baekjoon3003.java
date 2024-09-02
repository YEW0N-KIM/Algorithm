package Baekjoon;

import java.util.Scanner;

public class Baekjoon3003 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] chess = {1,1,2,2,2,8}; 
		String s = sc.nextLine();
		String [] now = s.split(" ");
		
		for(int i=0; i<chess.length; i++) {
			chess[i] = chess[i]- Integer.parseInt(now[i]);
			System.out.print(chess[i]+" ");
		}
	}
}
