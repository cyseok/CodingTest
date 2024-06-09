import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String[] sum = Integer.toString(n).split("");
        /*
        for (int i=0; i<sum.length; i++) {
            answer += Integer.parseInt(sum[i]);
        }
        */
        for(String arr : sum) {
            answer += Integer.parseInt(arr);
        }
        


        return answer;
    }
}