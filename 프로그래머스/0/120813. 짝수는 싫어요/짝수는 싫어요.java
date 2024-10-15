class Solution {
    public int[] solution(int n) {
        // int 배열을 사용하고 싶다면 배열의 길이를 먼저 계산해줘야한다.
        int length = (n % 2 == 0) ? n/2 : (n+1)/2;
        int[] answer = new int[length];
        int a = 0;
        
        for(int i=1; i<=n; i++) {
            if(i%2 != 0) {
                answer[a] = i;
                a++;
            }
            
        }
        return answer;
    }
}