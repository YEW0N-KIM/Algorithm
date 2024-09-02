package Baekjoon;

import java.util.Scanner;

public class Baekjoon5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sec = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); 
        
            if (c >= 'A' && c <= 'C') {
                sec += 3;
            } else if (c >= 'D' && c <= 'F') {
                sec += 4;
            } else if (c >= 'G' && c <= 'I') {
                sec += 5;
            } else if (c >= 'J' && c <= 'L') {
                sec += 6;
            } else if (c >= 'M' && c <= 'O') {
                sec += 7;
            } else if (c >= 'P' && c <= 'S') { 
                sec += 8;
            } else if (c >= 'T' && c <= 'V') {
                sec += 9;
            } else if (c >= 'W' && c <= 'Z') {
                sec += 10;
            }
        }
        
        System.out.println(sec);
        sc.close();
    }
}
