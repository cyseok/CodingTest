import java.util.*;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        // Long 타입을 String으로 변환하고 문자하나씩 String 배열에 저장
        String a = "";
        //String[] str = String.valueOf(n).split("");
        String[] str = Long.toString(n).split("");
        Arrays.sort(str);
        
        // String 배열에서 하나씩 가져와 StringBuilder로 저장
        StringBuilder stb = new StringBuilder();
        for(String list : str) {
            stb.append(list);
        }
        
        // 문자열로 반환 받고 문자 반전 후 Long 타입으로 변환
        a = stb.reverse().toString();
        answer = Long.parseLong(a);
        
        return answer;
    }
}