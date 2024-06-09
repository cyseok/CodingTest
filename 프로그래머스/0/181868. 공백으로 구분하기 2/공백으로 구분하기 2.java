class Solution {
    public String[] solution(String my_string) {
        return my_string.trim().split(" +");
    }
}

// trim : 문자열 앞, 뒤의 공백 제거
// split : 문자열 분리
// split(" +")는 공백 문자열을 모두 분리