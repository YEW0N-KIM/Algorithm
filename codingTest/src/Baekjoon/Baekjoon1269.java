package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Baekjoon1269 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] req = br.readLine().split(" ");
		
		int N = Integer.parseInt(req[0]);
		int M = Integer.parseInt(req[1]);
		
		HashSet<Integer> A = new HashSet<>();
		HashSet<Integer> B = new HashSet<>();
		
		String[] Aline = br.readLine().split(" ");
		String[] Bline = br.readLine().split(" ");
		for(int i=0; i<N; i++) {
			A.add(Integer.parseInt(Aline[i]));
		}

		for(int i=0; i<M; i++) {
			int a = Integer.parseInt(Bline[i]);
			if(A.contains(a)) {
				A.remove(a);
			}else {
				B.add(a);
			}
			
		}
		
		System.out.println(A.size()+B.size());
		
 	}
}
