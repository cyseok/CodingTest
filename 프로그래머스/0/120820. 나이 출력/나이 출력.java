class Solution {
    public int solution(int age) {
        int answer = 0;
        
        if(0 < age && age <= 120) {
            answer = 2023 - age;
        }
        // 출생년도 리턴 
        return answer;
    }
}