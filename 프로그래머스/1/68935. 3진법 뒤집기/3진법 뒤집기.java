class Solution {
    public int solution(int n) {
        
        int answer = 0;
        String str = "";
        
        String word = "";
        
        // 10진수를 n진수로 변경
        // Integer.toString(a,n)
        // n진수를 10진수로 변경
        // Integer.parseInt(a,n)
        
        // 1. 3진수로 변경 
        // 방법1
        // str = Integer.toString(n, 3);
        
        // 방법2
        while (n > 0) {
            // str의 끝에서 부터 값을 추가함 -> 앞뒤가 반전되며 저장됨
            // 이렇게 하면 현재 문제에서는 반전 과정이 불필요
            // str += (n % 3);
            
            // str의 앞에서 부터 값을 저장
            // 현재 문제에서 반전 과정이 필요해짐
            str = (n % 3) + str;
            n /= 3;
        }
        
        // 2. 앞뒤 반전
        for (int i = 0; i < str.length(); i++) {
            word += str.charAt(str.length()-1-i);
        }
        
        // 3. 10진법으로 변경
        answer = Integer.parseInt(word, 3);
        
        System.out.println(str);  // 반전 전의 3진법 수
        System.out.println(word);  // 반전 후의 3진법 수
        System.out.println(answer); // 반전된 수를 10진법으로 출력
        
        
        return answer;
    }
}