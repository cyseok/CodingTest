class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        // String answer1 = my_string.substring(0,n);
        
        String[] str = my_string.split(""); 

        for(int i=0; i<n ; i++){
            answer += str[i];
        }
        return answer;
    }
}