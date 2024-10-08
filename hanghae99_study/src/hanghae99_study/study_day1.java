package hanghae99_study;

import java.util.ArrayList;

public class study_day1 {

    static class Solution {
        public int[] solution(long n) {
            String word = Long.toString(n);
            int[] answer = new int[word.length()];

            int index = word.length() - 1;
            int a = 0;

            for (int i = index; i >= 0; i--) {
                answer[a] = word.charAt(i) - '0';
                a++;
            }

            return answer;
        }
    }
    
    static class Soultion2{
    	public int[] solution(long n) {
    		int index = Long.toString(n).length();
    		int[] answer = new int[index];
    		int i = 0;
    		while(n>0) {
    			answer[i] = (int)n%10;
    			i++;
    			n/=10;
    			
    		}
    		return answer;
    	}
    }
    
    static class Solution3{
    	public ArrayList<Integer> solution(long n) {
    		ArrayList<Integer> answer = new ArrayList<Integer>();
    		int i =0;
    		while(n>0) {
    			answer.add((int) (n%10));
    			i++;
    			n/=10;
    			
    		}
    		return answer;
    	}
    }

    public static void main(String[] args) {
    	Soultion2 sol = new Soultion2();
//        int[] answer = sol.solution(12345);
        
        Solution3 sol1 = new Solution3();
        ArrayList<Integer> answer = sol1.solution(12345);
        
        for (int a : answer) {
            System.out.print(a + " ");
        }
    }
}
