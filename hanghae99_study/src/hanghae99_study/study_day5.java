package hanghae99_study;

import java.util.*;

public class study_day5 {
	
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
		public int solution(int[] nums) {;
			int pick = (int) Arrays.stream(nums).distinct().count();
			int arr = nums.length/2;
			
			return Math.min(pick, arr);
		}
	}
	
	static class Solution3{
		public int solution(int[] nums) {
		int pick = (int) Arrays.stream(nums).distinct().count();
		int arr = nums.length/2;
		
		return pick>arr? arr: pick;
		}
	}
		
	static class Solution4{
		public int solution(int[] nums) {;
		HashSet<Integer> pocketmon = new HashSet<Integer>() ;
		for (int mon : nums) {
			pocketmon.add(mon);
		}
		
		return pocketmon.size()>nums.length/2? nums.length/2:  pocketmon.size();
		}
	}
	
	public static void main(String[] args) {
		int [] nums = {3,1,2,3};
		//		{3,3,3,2,2,4}	
		//		{3,3,3,2,2,2}	
		Solution3 sol = new Solution3();
		int answer = sol.solution(nums);
		System.out.println(answer);
		
	}
}
