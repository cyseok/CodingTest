class Solution {
    public int solution(int[] numbers, int n) {
         
        int answer = 0;
        // 향상된 for문
        // 장점
        // 배열 인덱스 문제 해결 (ArrayIndexOutOfBoundsException 예외를 피할 수 있다.)
        
        // 단점
        // 배열이나 ArrayList 값을 사용할 순 있지만 절대 수정할 수는 없다.
        
        // 사용
        // 1. ArrayList 원소 출력
        // 2. 배열 원소 출력

        for(int num: numbers) {
            answer += num;

            if(answer > n) 
                break;
            
        }
        return answer;
    }
}