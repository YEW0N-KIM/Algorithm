package Baekjoon;

import java.util.Scanner;

public class Baekjoon10951 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
	}
}

/*
	EOF의 주요 개념
	1. 입력 종료
	 프로그램이 데이터를 읽으려 할 때, 더 이상 읽을 수 있는 데이터가 없을 때 발생합니다. 
	 예를 들어, 파일의 끝에 도달하거나, 사용자 입력이 더 이상 없을 때 EOF가 발생합니다.
	
	2. 입력 스트림
	Scanner, BufferedReader와 같은 입력 스트림을 사용할 때, 
	EOF는 입력을 종료하는 신호로 작용합니다. 예를 들어, Scanner의 nextInt() 메서드는 더 이상 읽을 수 있는 정수가 없을 때 NoSuchElementException을 발생시킵니다.
	
	3. 파일 처리
	파일을 읽을 때, EOF는 파일의 끝을 나타내며, 이를 통해 프로그램은 더 이상 읽을 
	데이터가 없음을 인식하고 루프를 종료하거나 적절한 처리를 할 수 있습니다.
 * 
 */