package Baekjoon;

import java.util.Scanner;

public class Baekjoon2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		String word = sc.next();
		
		int cnt = 0;
		int start = 0;
		
		while(start < word.length()) {
			boolean find = false;
			
			for(int i=0; i<croatia.length; i++) {
				int end = start + croatia[i].length();
				if(end <= word.length() &&word.substring(start, end).equals(croatia[i])) {
					find =true;
					cnt ++;
					start=end;
				}
			}
			
			if(!find) {
				cnt++;
				start++;
			}
		}
		
		System.out.println(cnt);
		
	}
}
