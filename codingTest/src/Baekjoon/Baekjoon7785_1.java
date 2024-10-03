package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class Baekjoon7785_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // LinkedHashMap을 사용하여 입력 순서를 유지
        LinkedHashMap<String, Boolean> record = new LinkedHashMap<>();
        
        for (int i = 0; i < N; i++) {
            String[] line = br.readLine().split(" ");
            String name = line[0];
            String action = line[1];
            
            if (action.equals("enter")) {
                record.put(name, true); // "enter"일 때 추가
            } else {
                record.remove(name); // "leave"일 때 제거
            }
        }
        
        // 사무실에 남아 있는 사람들 출력
        for (String name : record.keySet()) {
            System.out.println(name);
        }
    }
}
