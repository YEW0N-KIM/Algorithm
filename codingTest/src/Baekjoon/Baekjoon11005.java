package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        
        long N = Long.parseLong(line[0]); // Long으로 변경
        int B = Integer.parseInt(line[1]);
        
        StringBuilder sb = new StringBuilder();
        while (N > 0) {
            long remainder = N % B;
            if (remainder < 10) {
                sb.append(remainder);
            } else { // remainder >= 10
                sb.append((char) ('A' + remainder - 10));
            }
            N /= B;
        }
        
        System.out.println(sb.reverse().toString());
    }
}
