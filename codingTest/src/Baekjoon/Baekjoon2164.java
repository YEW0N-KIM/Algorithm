package Baekjoon;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Baekjoon2164 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Deque<Integer> deque = new ArrayDeque<>();
		
		
		// 배열에 값 담기
		for(int i=1; i<=N; i++) {
			deque.add(i);
		}
		
		for(int i=0; i<N-1; i++) {
			deque.removeFirst();
			int a = deque.peekFirst();
			deque.removeFirst();
			deque.addLast(a);
		}
		System.out.println(deque.toString().replaceAll("[\\[\\],]", ""));
//		System.out.println(deque.peekFirst());
		
		
	}
}
