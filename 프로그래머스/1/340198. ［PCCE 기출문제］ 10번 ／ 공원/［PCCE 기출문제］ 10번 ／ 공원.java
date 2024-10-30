class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = 0;
        
        // 가장 큰 돗자리의 한 변 길이
        int maxSize = 0;
        // 돗자리를 더 깔 수 있는 상태
        boolean status = true;
        // 행
        int rows = park.length;
        // 열
        int columns = park[0].length;
        
        // 1. 빈자리를 찾는다.
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < columns; j++) {
                
                if(park[i][j].equals("-1")) {
                    status = true;
                    // 현재 위치에서의 사이즈를 1로 초기화
                    int currentSize = 1;  
                    //System.out.println(park[i][j]);
                    
                    // 2. 빈자리라면 그 부분을 시작점으로 두고 오른쪽 한칸, 아래로 한칸씩 가면서 한바퀴가 전부
                    // 빈자리라면 int +1 해준다...
                   
                    
                        while(true) {
                            // 테두리 부분이면
                            if(i + currentSize >= rows || j + currentSize >= columns) break;
                            
                            for(int k = i; k <= i+currentSize; k++) {
                                for(int l = j; l <= j+currentSize; l++) {
                                    if(!park[k][l].equals("-1")) {
                                        status = false;
                                        break;
                                    }
                                }
                                if(!status) break;
                            }
                            if(!status) break;
                            currentSize++;
                        }
                    
                        // 현재 자리의 사이즈가 maxSize보다 크면 변경
                        maxSize = Math.max(maxSize, currentSize);
                }    
            }
        }
        /*
        for(int i = 0; i < mats.length; i++) {
            if(mats[i] <= maxSize && mats[i] > answer) {
                answer = mats[i];
            }
            
        }
        */
        for(int num : mats) {
            if(num <= maxSize && num > answer) {
                answer = num;
            }
        }
        
        // 아무런 돗자리도 깔 수 없는 경우 -1 반환
        if(answer == 0) answer = -1;

        return answer;
    }
}