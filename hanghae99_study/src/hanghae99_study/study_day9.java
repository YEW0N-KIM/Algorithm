package hanghae99_study;

import java.util.*;

public class study_day9 {
	
	static class Solution {
		public int solution(int[]nums){
			int answer =0;
			int[] arr = new int [nums.length/2];
			int[] dist = Arrays.stream(nums).distinct().toArray();		
			int arrSize = Math.min(dist.length, arr.length);
			for(int i=0; i<arrSize; i++) {
				arr[i] = dist[i];
				if(arr[i]!=0) {
					answer++;
				}
			}
			
			return answer;
		}
	}
	
	static class Solution2{
	
	}
	
	static class Solution3{
	
	}
		
	static class Solution4{
	
	}
	
	public static void main(String[] args) {

		
	}
}
