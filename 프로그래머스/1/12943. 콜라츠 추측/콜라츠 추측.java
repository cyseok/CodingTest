class Solution {
    public int solution(long num) {
        // 반복 횟수
        int answer = 0;
        
        while(num != 1) {
            
            if(answer == 500) {
                answer = -1;
                break;
            }
            
            if(num%2 == 0) {
                num /= 2;
            } else {
                num = (num*3) + 1;
            }
            answer++;
        }
        
        System.out.println(answer);
        
        return answer;
    }
}