package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon4134_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            long N = Long.parseLong(br.readLine().trim());

            // N이 2보다 작으면 2를 출력
            if (N < 2) {
                sb.append(2).append("\n");
                continue;
            }

            // N이 소수가 아닐 경우 N을 증가시키며 소수를 찾음
            while (!isPrime(N)) {
                N++;
            }
            sb.append(N).append("\n");
        }

        System.out.println(sb.toString().trim());
    }

    public static boolean isPrime(long n) {
        if (n < 2) return false; // 2보다 작은 수는 소수가 아님
        if (n == 2) return true; // 2는 소수
        if (n % 2 == 0) return false; // 짝수는 소수가 아님

        for (long i = 3; i * i <= n; i += 2) { // 홀수만 검사
            if (n % i == 0) {
                return false; // 약수가 있으면 소수가 아님
            }
        }
        return true; // 소수
    }
}
