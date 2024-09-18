package Baekjoon;

import java.util.Scanner;

public class Baekjoon2231 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int answer = 0;
		for(int i=0; i<N; i++) {
			int a  = i/100;
			int b = i%100/10;
			int c = i%100%10;
			int sum = a + b + c + i;
			if(sum == N) {
				answer = i;	break;
			} 			
		}
		System.out.println(answer!=0?answer: 0);
		
	}
	
	

	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int answer = 0;

	        for (int i = 1; i < N; i++) { // 1부터 N-1까지 반복
	            int sum = i;
	            int temp = i;

	            // 각 자릿수 합산
	            while (temp > 0) {
	                sum += temp % 10; // 일의 자리 더하기
	                temp /= 10; // 다음 자리로 이동
	            }

	            if (sum == N) {
	                answer = i; // 최소 생성자 업데이트
	                break; // 최소 생성자 찾으면 종료
	            }
	        }

	        System.out.println(answer); // 최소 생성자 출력
	    }
	}

} 


