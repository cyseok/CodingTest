class Solution {
    public int solution(String message) {
        int answer = 0;
        
        String[] str = message.split("");
        answer = str.length * 2;
        return answer;
    }
}