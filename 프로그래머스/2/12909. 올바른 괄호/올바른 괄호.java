class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;

        // 하나씩 (일때+,)일때- 해주고 음수면 false 리턴
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                cnt++;
            } else {
                cnt--;
            }
            
            if(cnt < 0) {
                answer = false; 
                break;
            }
        }
        
        
        if(cnt != 0) {
            answer = false;
        }
        
        return answer;
        
        /*
        // 스택 사용 코드
        boolean answer = true;  
        String res = "YES";
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '(') {
                    st.push(1);
                } else if (s.charAt(i) == ')') {
                    if (st.isEmpty()) {
                        answer = false;
                        break;
                    } else {
                        st.pop();
                    }
                }
            }

            if(!st.isEmpty()) {

                answer = false;

            }

            System.out.println(res);
            return answer;
        */
    }
}