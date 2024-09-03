package Baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Baekjoon1157 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.next().toUpperCase();
		
		// 사용 알파벳 배열
		String[] arr = new String [s.length()]; 
		
		for(int i = 0; i<s.length(); i++ ) {
			arr[i] = s.charAt(i)+"";
		}
		
		// 중복 제거 알파벳
		String[] check = (String[]) Arrays.stream(arr).distinct().toArray(String[]::new); 
		
		int[] cnt = new int[check.length];
		
		for(int i = 0; i<check.length; i++) {
			for(int j = 0; j<arr.length; j++) {
				if(check[i].equals(arr[j])) {
					cnt[i]++;
				}
			}
		}
		
		boolean answer = false;
		int max = 0; int max_index = 0;
		for(int i=0; i<cnt.length;i++) {
			if (max<cnt[i]) {
				max = cnt[i];
				max_index = i;
				answer = false;
			} else if (cnt[i] == max) {
				answer = true;
			}
		}
		
		System.out.println(answer? "?" : check[max_index]);
	}
}
