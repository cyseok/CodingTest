class Solution {
    public boolean solution(int x) {
        boolean answer = true;

        //==================================
        // 방법 1
        // 자리수를 직접 구한다..
        /*
        int a = x % 10;
        int b = (x / 10) % 10;
        int c = (x / 100) % 10;
        int d = (x / 1000) % 10;
        int e = (x / 10000) % 10;
        
        int sum = a+b+c+d+e;
        
        if(x%sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        */
        //=================================
        // 방법 2
        // int를 String으로 변환해서 split 사용
        // Integer.toString(x): 정수 x를 문자열로 변환
        // x가 123이면 Integer.toString(x)는 "123"이 된다.
        // .split(""): 이 문자열을 빈 문자열 기준으로 나눈다. "123".split("")는 ["1", "2", "3"]이 된다.
        // String[] arr: 결과로 나온 문자열 배열을 arr라는 이름의 변수에 저장합니다.
        String[] arr = Integer.toString(x).split("");

        int sum = 0;

        for(int i=0;i<arr.length;i++){
            //  정수로 변환
            sum += Integer.parseInt(arr[i]);
        }
        
        System.out.println("sum"+sum);
        
        if(x%sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        //==================================
        // 방법 3
        // while문 사용
        /*
        int sum = 0;
        int a = x;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
            System.out.println("sum"+sum);
            System.out.println("x"+x);
        }
    
        if(a%sum == 0) {
            answer = true;
        } else {
            answer = false;
        }
        */
        //==================================
        return answer;
    }
}