package hanghae99_study;

import java.util.*;

public class study_day6 {
	
	static class Solution {
		  public int[] solution(int []arr) {
		        int j=0;
		        for(int i =1; i<arr.length; i++){
		            if(arr[j]==arr[i]){
		                arr[j]= 10;
		            } 
		            j++;
		        }
		        int count = (int)Arrays.stream(arr).filter(e -> e!=-1).count();
		         int[] answer = new int[count];

		        j=0;

		       for(int i=0 ; i<arr.length; i++){
		            if(arr[i]!=10){
		                answer[j] = arr[i];
		                j++;
		            }
		       }

		        return answer;
		    }
	}
	
	static class Solution2{
		 public int[] solution(int[] arr) {
	        // 중복 제거를 위한 ArrayList
	        ArrayList<Integer> tempList = new ArrayList<>();
	        
	        // 첫 번째 값을 초기값으로 설정
	        if (arr.length > 0) {
	            tempList.add(arr[0]);
	        }
	        
	        // 배열을 순회하며 중복된 연속 값 제거
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] != arr[i - 1]) {
	                tempList.add(arr[i]);
	            }
	        }
	        
	        // ArrayList를 int 배열로 변환
	        int[] answer = new int[tempList.size()];
	        for (int i = 0; i < tempList.size(); i++) {
	            answer[i] = tempList.get(i);
	        }
	        
	        return answer;
	    }
	
	}
	
	static class Solution3{
		 public int[] solution(int[] arr) {
		        // 중복 제거를 위한 ArrayList
		        ArrayList<Integer> tempList = new ArrayList<>();
		        
		        // 첫 번째 값을 초기값으로 설정
		        int tempNum = 10;
		        
		        // 배열을 순회하며 중복된 연속 값 제거
		        for (int i = 1; i < arr.length; i++) {
		            if (arr[i] != arr[i - 1]) {
		                tempList.add(arr[i]);
		            }
		        }
		        
		        // ArrayList를 int 배열로 변환
		        int[] answer = new int[tempList.size()];
		        for (int i = 0; i < tempList.size(); i++) {
		            answer[i] = tempList.get(i);
		        }
		        
		        return answer;
		    }
	}
		
	static class Solution4{
		 public int[] solution(int []arr) {
		        ArrayList<Integer> tempList = new ArrayList<Integer>();
		        int preNum = 10;
		        for(int num : arr) {
		            if(preNum != num)
		                tempList.add(num);
		            preNum = num;
		        }       
		        int[] answer = new int[tempList.size()];
		        for(int i=0; i<answer.length; i++) {
		            answer[i] = tempList.get(i).intValue();
		        }
		        return answer;
		    }
	}
	
	static class Solution5{
		 public ArrayList<Integer>solution(int []arr) {
		        ArrayList<Integer> tempList = new ArrayList<Integer>();
		        int preNum = 10;
		        for(int num : arr) {
		            if(preNum != num)
		                tempList.add(num);
		            preNum = num;
		        }       
		        return tempList;
		    }
	}
	
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		
		
		
	}
}
