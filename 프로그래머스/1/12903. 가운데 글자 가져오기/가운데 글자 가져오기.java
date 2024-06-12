class Solution {
    public String solution(String s) {
        String answer = "";
        //System.out.println(s.length());
        
        // 길이가 짝수, 홀수일 때
        if(s.length() % 2 == 0) {
            answer = s.substring((s.length()/2)-1, (s.length()/2)+1);
            System.out.println(answer);
        } else {
            answer = s.substring((s.length()-1)/2, (s.length()+1)/2);
            System.out.println(answer);
        }
        return answer;
    }
}