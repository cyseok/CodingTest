class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        
        int cnt = 0;
        int removeZeroCnt = 0;

        while(!s.equals("1")) {
            int length = 0;
            
            for (int i = 0; i < s.length(); i ++) {
                char a = s.charAt(i);
                
                if(a != '0') {
                    length++;
                } else {
                    removeZeroCnt++;
                }
            }
 
            s = Integer.toString(length, 2);  
            cnt++;
            
        }
        
        answer[0] = cnt;
        answer[1] = removeZeroCnt;
        
        return answer;
    }
}