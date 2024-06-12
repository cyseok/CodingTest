import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder stb = new StringBuilder();
        String[] str = s.split("");
        
        Arrays.sort(str);
        
        for(String a : str) {
            stb.append(a);
        }
        
        //System.out.println(Arrays.toString(str));
        System.out.println(String.join("", str));
        
        answer = stb.reverse().toString();
        System.out.println(answer);
        return answer;
    }
}