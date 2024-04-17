class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        
        // numbers의 길이가 1이상 100이하인지 확인
        if (numbers.length < 1 || numbers.length > 100) {
            return -1; 
        }

        // numbers의 원소가 모두 0 이상 1000 이하인지 확인
        for (int number : numbers) {
            if (number < 0 || number > 1000) {
                return -1;
            }
        }

        for (int number : numbers) {
            answer += number;
        }
        answer /= numbers.length;
        
        return answer;
        
        // 스트림 사용해 작성
        // return Arrays.stream(numbers).average().orElse(0);
    }
}