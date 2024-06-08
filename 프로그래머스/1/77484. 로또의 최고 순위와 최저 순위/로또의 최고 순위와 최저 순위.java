import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        // 서로 같은 숫자의 개수
        int same_number = 0;
        // 0 숫자의 개수
        int zero_cnt = 0;
        
        // 최대 등수
        int max_num = 0;
        // 최소 등수
        int min_num = 0;
        
        int[] answer = new int[2];
        
        for(int i=0; i<lottos.length; i++) {
            if(lottos[i] == 0) {
                zero_cnt++;
                continue;
            }
            
            for(int j=0; j<win_nums.length; j++) {
                if(lottos[i] == win_nums[j]) {
                    same_number++;
                }   
                    
            }
        }
        
        System.out.println(same_number);
        System.out.println(zero_cnt);
        
        // 최대 등수
        int sum = same_number + zero_cnt;
        
        switch(sum) {
            case 0 : max_num = 6;
                break;
            case 1 : max_num = 6;
                break;
            case 2 : max_num = 5;
                break;
            case 3 : max_num = 4;
                break;
            case 4 : max_num = 3;
                break;
            case 5 : max_num = 2;
                break;
            case 6 : max_num = 1;
                break;
        }
        
        // 최소 등수
        switch(same_number) {
            case 0 : min_num = 6;
                break;
            case 1 : min_num = 6;
                break;
            case 2 : min_num = 5;
                break;
            case 3 : min_num = 4;
                break;
            case 4 : min_num = 3;
                break;
            case 5 : min_num = 2;
                break;
            case 6 : min_num = 1;
                break;
        }
        
        answer[0] = max_num;
        answer[1] = min_num;
        
        System.out.println(Arrays.toString(answer));
        
        
        // *** switch 문을 중복 사용하지 말고 함수로 사용해보자
        return answer;
    }
}