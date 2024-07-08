import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        // PriorityQueue<Integer> priQueue = new PriorityQueue<>();
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        // priQueue 큐에 priorities 요소 추가
        for(int i : priorities) {
            queue.offer(i);
        }
    
        // 
        System.out.println(Arrays.toString(queue.toArray()));
        
        while(!queue.isEmpty()) {
        
			for(int i=0; i<priorities.length; i++) {
				if(priorities[i] == queue.peek()) {
					queue.poll();
					answer++;
					if(i == location)
						return answer;
				}
			}
		}  
        return answer;
    }
}
