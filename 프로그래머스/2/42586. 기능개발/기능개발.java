import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
    
        ArrayList<Integer> answer = new ArrayList<Integer>();
        Deque<Integer> deque = new ArrayDeque<>();
    
        int cnt = 0;
        int speedsIndex = 0;
        int dequeSize = 0;
    
        for(int i=0; i<progresses.length; i++) {
                // addLast() : 값을 데크의 마지막에 추가
                deque.addLast(progresses[i]);
        }
        
        // 이후에 데크의 값을 빼주기 때문에 변동이 생겨, 최초 데크의 길이를 선언했다.
        dequeSize = deque.size();
    
        while(!deque.isEmpty()) {
    
            // peekFirst() : 데크의 첫번째 요소 반환
            while(deque.peekFirst() < 100) {
                for(int i=speedsIndex; i<dequeSize; i++) {
                    // 첫번째 요소를 스피드랑 더해서 마지막 요소에 저장
                    // 100 미만이라면 speeds를 더해주고 그 외는 요소값을 그대로
                    if(deque.peekFirst() < 100) {
                        deque.addLast(deque.pollFirst() + speeds[i]);
                        
                    } else {
                        deque.addLast(deque.pollFirst());
                    }
                }
            }
        
            // 첫번째 요소가 100이상이라면 첫번째 요소를 제거하고 배포 횟수(cnt)를 1 증가한다.
            while(deque.peekFirst() >= 100) {
                deque.pollFirst();
                cnt++;   
                // 데크를 뺀 만큼 speedsIndex도 추가해줘 배열의 index 순서도 맞춰준다.
                speedsIndex++;
                // 마지막 요소를 제거했다면 break; 
                if(deque.peekFirst() == null) break;
                
            }
            // 배포 횟수를 List에 추가하고
            answer.add(cnt);
            // 다시 0으로 초기화
            cnt = 0;
            // 데크가 비면 break; 
            if(deque.isEmpty()) break;
        }  
        
        return answer;
    }
}