class Solution {
    public int solution(int angle) {
        
        switch (angle) {
            case 90:
                return 2; // 직각
            case 180:
                return 4;
            default:
                if (angle < 90) {
                    return 1; // 예각
                } else {
                    return 3; // 둔각
                }
        }
        
        // 삼항 연산자 사용
        // return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : angle > 90 ? 3 : 0;
    }
}