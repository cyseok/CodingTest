class Solution {
    public String solution(String s) {
        String answer = "";
        int a = s.length();
        //System.out.println(s.length());
        
        // 길이가 짝수, 홀수일 때
        if(s.length() % 2 == 0) {
            answer = s.substring((a/2)-1, (a/2)+1);
            System.out.println(answer);
        } else {
            answer = s.substring((a-1)/2, (a+1)/2);
            System.out.println(answer);
        }
        return answer;
    }
}