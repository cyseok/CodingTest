class Solution {
    public String solution(int n) {
        String a = "수박";
        String b = "수";
        String answer = "";
        
        if(n%2 == 0) {
            answer = a.repeat(n/2);
        } else {
            answer = a.repeat((n-1)/2) + b;
        }
        
        return answer;
    }
}