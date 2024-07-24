package hanghae99_study;

public class study_day3 {
	
	static class Solution {
		 boolean solution(String s) {
		        boolean answer = true;
		        int p = 0, y=0;
		        for(int i=0; i<s.length();i++){
		            if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
		                p++;
		            } else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
		                y++;
		            }
		        }
		        answer = p==y ? true: false;
		       

		        return answer;
		    }
	}
	
	static class Solution2{
		 boolean solution(String s) {
	        boolean answer = true;
	        s= s.toUpperCase();
	        int count = 0;
	        for(int i=0; i<s.length();i++){
	            if( s.charAt(i) == 'P'){
	               count++;
	            } else if(s.charAt(i) == 'Y'){
	                count--;
	            }
	        }
	        answer = count==0 ? true: false;
	       

	        return answer;
	    }
	}
	
	static class Solution3{
		boolean solution(String s) {
			 s= s.toUpperCase();
			 return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();

		}
	}
	
	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		boolean answer =sol.solution("PpYyP");
		System.out.print(answer);
	}
}
