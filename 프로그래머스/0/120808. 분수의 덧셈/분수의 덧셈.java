class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int[] answer = new int[2];
        
        int gcd = 0;
        
        // 분자, 분모
        int numer = (numer1 * denom2) + (denom1 * numer2);
        int denom = denom1 * denom2;
        
        // 최대 공약수 구하기
        int min = Math.min(numer,denom);
        for(int i=min; i>=1; i--) {
            if(numer % i == 0 && denom % i == 0) {
                gcd = i;
                break;
            }
        }
        
        if(gcd >= 1) {
            answer[0] = numer / gcd;
            answer[1] = denom / gcd;
        } else {
            answer[0] = numer;
            answer[1] = denom;
        }
        System.out.println(numer);
        System.out.println(denom);
    // 유클리드 호제법
   /*
    public static int gcd(int n, int m) {
        while (m != 0) {
            int tmp = n % m;
            n = m;
            m = tmp;
        }

        return n;
    }
    */
        
        
        return answer;
    }
}