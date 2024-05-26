class Solution {
    boolean solution(String s) {
        // 문자를 소문자 or 대문자로 변환한 후 사용하는 방법도 있다.
        //s = s.toLowerCase();
        
        boolean answer = true;

        int p_count = 0;
        int y_count = 0;

        for (int i = 0; i < s.length(); i++) {
          if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
            p_count++;
          }
          if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
            y_count++;
          }
        }
        
        if(p_count == y_count) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}