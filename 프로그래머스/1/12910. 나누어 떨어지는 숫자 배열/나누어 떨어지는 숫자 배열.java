import java.util.*;

class Solution {
    
    public int[] solution(int[] arr, int divisor) {
        
        // 방법 1
        int cnt = 0;
        int num = 0;
        
        for(int i= 0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                cnt++;
            }
        }
        
        if(cnt == 0) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[cnt];
        for(int i= 0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer[num] = arr[i];
                num++;
            }
        }
        
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
        return answer;
    }
    
    /* 방법 2
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0)
                list.add(arr[i]);
        }

        if(list.size() == 0){
            answer = new int[]{-1};
        }else{
            answer = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                answer[i] = list.get(i);
            }
            Arrays.sort(answer);
        }
        return answer;
    }
    */
        
    /* 방법 3
    public List<Integer> solution(int[] arr, int divisor) {
        // int[] answer = new int[n];
        ArrayList<Integer> answer= new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % divisor == 0) {
                answer.add(arr[i]);
            }
        }
        
        if (answer.isEmpty()) {
            // answer.add(index, n);
            answer.add(-1);
        } else {
            Collections.sort(answer);
        }
        
        // answer.add(index, n);
        System.out.println(answer);
        return answer;
    }
    */
}