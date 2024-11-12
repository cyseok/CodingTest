import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


class Solution {
    public int[] solution(int[] num_list) {
       
        List<Integer> list = new ArrayList<>();
        
        for(int i : num_list) {
            list.add(i);
        }
        
        Collections.reverse(list);
        
        // 반환형을 꼭 int[]로 해야한다면..
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}