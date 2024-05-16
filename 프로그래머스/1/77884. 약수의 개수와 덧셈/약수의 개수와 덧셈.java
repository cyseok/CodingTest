class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        // 수를 하나씩 증가시키면서 나머지가 0인수를 약수로 취급한다.
        // left = 10;
        for(int i=left; i<=right; i++){
            int a = 0;
            for(int j=1; j<=i; j++) {
                if((i % j) == 0) {
                    // 약수라면 개수를 하나씩 더해준다.
                    a += 1;
                }
                
            }
            
            System.out.println(a); // 약수의 개수
            System.out.println(i); // 본래 수
            
            if((a%2) == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}