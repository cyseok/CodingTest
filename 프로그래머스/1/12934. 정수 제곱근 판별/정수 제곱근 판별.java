class Solution {
    public long solution(long n) {
        long answer = 0;
        /*
        for(long i=1; i*i<=n; i++) {
            if(i*i == n) {
                answer = (i+1)*(i+1);
                break;
            } else {
                answer = -1;
            }
        }
        */
        
        // Math 클래스의 sqrt, pow 메소드 사용
        long sqrt = (long) Math.sqrt(n);
        if(n == Math.pow(sqrt,2)) {
            return (long)Math.pow(sqrt+1, 2);
        } else {
        	return -1;
        }
    }
}