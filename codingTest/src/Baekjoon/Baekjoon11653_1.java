package Baekjoon;

import java.util.Scanner;

public class Baekjoon11653_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        // 2부터 N까지 소인수 찾기
        for (int i = 2; i <= N; i++) {
            while (N % i == 0) {
                System.out.println(i); // 소인수 출력
                N /= i; // 나누기
            }
        }
        
        sc.close();
    }
}