class Solution {
    public int solution(int n) {
        // 배열 사용으로 전에 계산한 값을 메모리에 저장해두는 방식의 사용해 연산량을 줄이는 방법이라고 한다..
        int[] answer = new int[n+1];
        answer[0] = 0;
        answer[1] = 1;
        
        for(int i=2; i<=n; i++) {
            answer[i] = (answer[i-2] + answer[i-1]) % 1234567;
        }
        return answer[n];
    }
}