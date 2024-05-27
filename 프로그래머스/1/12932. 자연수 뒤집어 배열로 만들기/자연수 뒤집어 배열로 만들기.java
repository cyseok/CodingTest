class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        // String a = Integer.toString(n);
        String str = Long.toString(n);
        //String str = String.valueOf(n);
        //System.out.println(lon);
        
        //String str = Integer.toString(n);
        // 배열 크기 설정
        int[] result = new int[str.length()];
        
        // 문자열을 역순으로 순회하며 배열에 숫자를 저장
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(str.length() - 1 - i) - '0';
        }
        
        return result;
    }
}