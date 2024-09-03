package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon25206 {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader (new InputStreamReader(System.in));
		
		double sum = 0; double scoresum = 0;
		
		String line;
		while((line = bf.readLine())!=null) {
			
			String[] parts = line.split(" ");
		  if (parts.length < 3) {
                continue; // 입력이 올바르지 않은 경우 무시
            }
			sum += Double.parseDouble(parts[2].equals("P")? "0.0":parts[1]);
			
			double score = 0;
			switch(parts[2]) {
				case "A+" : score = 4.5; 
				break;
				case "A0" : score = 4.0;  
				break;
				case "B+" : score = 3.5;  
				break;
				case "B0" : score = 3.0;  
				break;
				case "C+" : score = 2.5;  
				break;
				case "C0" : score = 2.0;  
				break;
				case "D+" : score = 1.5;  
				break;
				case "D0" : score = 1.0; 
				break;
				case "F" : score = 0;  
				break;
				case "P" : score = 0;  
				break;
				
			}
			scoresum += Double.parseDouble(parts[1]) *score;
		}
		System.out.println(String.format("%.6f", scoresum/sum));
		
	}
}
