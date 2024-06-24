import java.util.*;

public class Solution {
    
    public int[] solution(int []arr) {
        
        // Stack<Integer> stack = new Stack<>();
        Deque<Integer> deque = new ArrayDeque<>();

        for(int i : arr) {
            // 향상된 for문에서 선언된 변수는 배열을 하나씩(모두) 반환한다!
            
            // peekLast() : // 데크의 마지막 요소를 반환 -> 덱이 비어있는 경우 예외를 발생시키지 않고 null을 반환
            if(deque.peekLast() == null || deque.peekLast() != i) {
                 // addLast() : // 데크 맨 끝에 요소를 추가
                 deque.addLast(i);
            } 
        }
        
        int[] answer = new int[deque.size()];
        
        for (int i = 0; i < answer.length; i++) {
            // pollFirst() : // 데크 첫번째 요소를 반환하고 제거
            answer[i] = deque.pollFirst();
        }

        return answer;
    }
    /*
    public Deque<Integer> solution(int []arr) {

        Deque<Integer> deque = new ArrayDeque<>();

        for(int i : arr) {
            // 향상된 for문에서 선언된 변수는 배열을 하나씩(모두) 반환한다!
            
            // peekLast() : // 데크의 마지막 요소를 반환 -> 덱이 비어있는 경우 예외를 발생시키지 않고 null을 반환
            if(deque.peekLast() == null || deque.peekLast() != i) {
                 // addLast() : // 데크 맨 끝에 요소를 추가
                 deque.addLast(i);
            } 
        }

        return deque;
    }
    */
}