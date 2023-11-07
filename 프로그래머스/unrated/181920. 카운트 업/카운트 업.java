
import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int start_num, int end_num) {
       
     ArrayList<Integer> answerList = new ArrayList();        

        for(int i = start_num; i <= end_num; i++) {
            answerList.add(i);
        }
        return answerList;
    }
}