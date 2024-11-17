class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] str = {"aya", "ye", "woo", "ma"};

        // babbling의 요소를 하나씩 꺼내서 str의 요소를 " "으로 치환
        // => ""으로 치환하게 되면 조합 유효성이 맞지 않게 됨.
        
        for(int i = 0; i < babbling.length; i++) {
            String word = babbling[i];
            
            for(String s : str) {
                word = word.replaceAll(s, " ");
            }
            
            // word " "를 공백으로 치환하고 길이가 0이면 answer++
            word = word.replaceAll(" ", "");
            if(word.length() == 0) {
               answer++;
            }
        }
        
        
        return answer;
    }
}