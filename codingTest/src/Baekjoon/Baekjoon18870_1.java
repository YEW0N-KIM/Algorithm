package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Baekjoon18870_1 {
	public static void main(String[] args) throws IOException{
		
		  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	        int N = Integer.parseInt(br.readLine());
	        int[] arr = new int[N];
	        String[] line = br.readLine().split(" ");
	        
	        for (int i = 0; i < N; i++) {
	            arr[i] = Integer.parseInt(line[i]);
	        }
	        
	        // 중복 제거 및 정렬
	        int[] sortedUnique = Arrays.stream(arr).distinct().toArray();
	        Arrays.sort(sortedUnique);
	        
	        // 결과 배열 생성
	        StringBuilder sb = new StringBuilder();
	        for (int num : arr) {
	            int index = Arrays.binarySearch(sortedUnique, num);
	            sb.append(index).append(" ");
	        }
	        
	        System.out.println(sb.toString().trim());
		
	}
}
