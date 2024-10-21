import java.util.Arrays;
class Solution {
    public int solution(int[] array) {
        
        int answer = array[0];
        int currentCount = 1;
        int nextNum = 0;
        int nextCount = 1;
        
        // 최빈값의 개수
        int sameCount = 1;
        
        
        Arrays.sort(array);
        
        for (int i = 1; i < array.length; i++) {
            // 다음 값이 이전 값과 같다면 현재 값의 빈도 +1
            // 다르다면 현재 값의 개수를 빈도 최대 빈도 값의 개수로 저장 후 1로 초기화
            if (array[i] == array[i-1]) {
                nextCount++; 
            } else {
                //currentCount = nextCount;
                nextCount = 1; 
            }

            // 새로운 최빈값을 찾으면 값 변경
            if (nextCount > currentCount) {
                currentCount = nextCount;
                answer = array[i];
                sameCount = 1;
            } else if (currentCount == nextCount) {
                sameCount++;
            }
            
        }
    
        if(sameCount > 1) {
            return -1;
        } else {
            return answer;
        }
        
    }
}