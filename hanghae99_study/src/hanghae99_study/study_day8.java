package hanghae99_study;

import java.util.*;

public class study_day8 {
	
	static class Solution {
		public String[] findRelativeRanks(int[] score) {
	        int n = score.length;
	        int[] sortedScores = new int[n];
	        String[] rank = new String[n];

	        // 점수 배열 복사
	        for (int i = 0; i < n; i++) {
	            sortedScores[i] = score[i];
	        }

	        // 점수 배열 정렬
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (sortedScores[i] < sortedScores[j]) {
	                    int temp = sortedScores[i];
	                    sortedScores[i] = sortedScores[j];
	                    sortedScores[j] = temp;
	                }
	            }
	        }

	        // 순위 매기기
	        for (int i = 0; i < n; i++) {
	            int position = 0;
	            for (int j = 0; j < n; j++) {
	                if (score[i] == sortedScores[j]) {
	                    position = j; // 위치 찾기
	                    break;
	                }
	            }

	            if (position == 0) {
	                rank[i] = "Gold Medal";
	            } else if (position == 1) {
	                rank[i] = "Silver Medal";
	            } else if (position == 2) {
	                rank[i] = "Bronze Medal";
	            } else {
	                rank[i] = String.valueOf(position + 1); // 1부터 시작하는 순위
	            }
	        }

	        return rank;
	    }
	}
	
	static class Solution2{
		public String[] findRelativeRanks(int[] score) {
	        int n = score.length;
	        String[] rank = new String[n];
	        int[] sortedScores = score.clone(); // 점수 배열 복사

	        // 점수 배열 정렬
	        Arrays.sort(sortedScores);

	        // 순위 매기기 위한 HashMap
	        HashMap<Integer, String> rankMap = new HashMap<>();

	        // 순위 설정 (내림차순)
	        for (int i = n - 1; i >= 0; i--) {
	            if (i == n - 1) {
	                rankMap.put(sortedScores[i], "Gold Medal");
	            } else if (i == n - 2) {
	                rankMap.put(sortedScores[i], "Silver Medal");
	            } else if (i == n - 3) {
	                rankMap.put(sortedScores[i], "Bronze Medal");
	            } else {
	                rankMap.put(sortedScores[i], String.valueOf(i + 1));
	            }
	        }

	        // 원래 점수에 대한 순위 반환
	        for (int i = 0; i < n; i++) {
	            rank[i] = rankMap.get(score[i]);
	        }

	        return rank;
	    }
	}
	
	static class Solution3{
		public String[] findRelativeRanks(int[] score) {
	        int n = score.length;
	        String[] rank = new String[n];
	        int[] sortedScores = score.clone(); // 점수 배열 복사

	        // 점수 배열 정렬
	        Arrays.sort(sortedScores);

	        // 순위를 매기기 위한 HashMap
	        HashMap<Integer, String> rankMap = new HashMap<>();

	        // 순위 설정 (내림차순)
	        for (int i = n - 1; i >= 0; i--) {
	            if (i == n - 1) {
	                rankMap.put(sortedScores[i], "Gold Medal");
	            } else if (i == n - 2) {
	                rankMap.put(sortedScores[i], "Silver Medal");
	            } else if (i == n - 3) {
	                rankMap.put(sortedScores[i], "Bronze Medal");
	            } else {
	                rankMap.put(sortedScores[i], String.valueOf(i + 1));
	            }
	        }

	        // 원래 점수에 대한 순위 반환
	        for (int i = 0; i < n; i++) {
	            rank[i] = rankMap.get(score[i]);
	        }

	        return rank;
	    }
	}
		
	static class Solution4{
	
	}
	
	public static void main(String[] args) {

		
	}
}
