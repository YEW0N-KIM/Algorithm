package hanghae99_study;

public class study_day2 {
	
	static class Solution {
	    public double solution(int[] arr) {
	        double answer = 0;
	        for(int i=0; i<arr.length;i++){
	            answer+=arr[i];
	        }

	        return answer/arr.length;
	    }
	}
	
	static class Solution2{
		public double solution(int[] arr) {
			double answer = 0;
			for(int i : arr) {
				answer+=i;
			}
			
			return answer/arr.length;
		}
	}
	
	static class Solution3{
		public double solution(int[] arr) {
			double answer = 0;
			
			return answer;
		}
	}
	
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		int [ ] arr = {1,2,3,4};
		double answer = sol.solution(arr);
		System.out.print(answer);
	}
}