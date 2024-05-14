import java.util.Arrays;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        //Arrays.sort(B, Collections.reverseOrder());
        
        System.out.println(A.length);
            
        for(int i = 0; i < A.length; ++i) {
            answer += A[i]*B[A.length-1-i];
        }
            
        return answer;
        
    }
}