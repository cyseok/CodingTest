class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        /*
        String str = Long.toString(n);
        //String str = String.valueOf(n);
        //String str = Integer.toString(n);
        
        // 배열 크기 설정
        int[] result = new int[str.length()];
        
        // 문자열을 역순으로 순회하며 배열에 숫자를 저장
        // - '0': 문자를 숫자로 변환하기 위해 '0'을 빼준다. 
        //ASCII 코드에서 숫자 0의 코드는 48이고, 영문자 A의 코드는 65입니다. 
        //즉, 문자 코드값에서 48을 빼면 해당 문자가 나타내는 숫자 값을 얻을 수 있습니다. 
        //예를 들어, 'A'의 코드값은 65이므로 65 - 48 = 17이 되고, 이는 숫자 1에 해당합니다.
        for (int i = 0; i < str.length(); i++) {
            //result[i] = str.charAt(str.length() - 1 - i) - '0';
            result[i] = str.charAt( i) - '0';
        }
        */
        //==================================
        // n의 값을 문자열로 변환
        String s = String.valueOf(n);
        // StringBuilder 객체 생성
        StringBuilder sb = new StringBuilder(s);
        // 문자열 뒤집기
        sb = sb.reverse();
        
        String[] str = sb.toString().split("");
        int[] result = new int[str.length];

        for(int i = 0; i < str.length; i++) {
            // str[i] 문자열을 10진수 정수로 변환
            result[i] = Integer.parseInt(str[i]);
        }
        
        
        return result;
    }
}