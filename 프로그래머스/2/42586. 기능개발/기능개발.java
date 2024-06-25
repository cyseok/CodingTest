import java.util.*;

class Solution {
    public List<Integer> solution(int[] progresses, int[] speeds) {
        
        
        ArrayList<Integer> answer = new ArrayList<Integer>();
        Deque<Integer> deque = new ArrayDeque<>();
        int cnt = 0;
        int speedsIndex = 0;
        int dequeSize = 0;
        
       
        for(int i=0; i<progresses.length; i++) {
            deque.addLast(progresses[i]);
        }
      
        dequeSize = deque.size();
        
        while(!deque.isEmpty()) {
            
            while(deque.peekFirst() < 100) {
                for(int i=speedsIndex; i<dequeSize; i++) {
                    
                    if(deque.peekFirst() < 100) {
                        deque.addLast(deque.pollFirst() + speeds[i]);
                        
                    } else {
                        deque.addLast(deque.pollFirst());
                    }
                }
            }
            
            while(deque.peekFirst() >= 100) {
                deque.pollFirst();
                cnt++;
                speedsIndex++;
                
                
                if(deque.peekFirst() == null) break;
                
            }
            System.out.println(speedsIndex);
            answer.add(cnt);
            cnt = 0;
            
            if(deque.isEmpty()) break;
            
        }
        
        return answer;
    }
}