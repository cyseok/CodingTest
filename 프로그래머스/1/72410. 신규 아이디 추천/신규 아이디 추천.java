class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 1단계
        // 모든 대문자를 대응되는 소문자로 치환합니다.
        // StringBuilder는 가변(mutable) 객체로, 내부적으로 변경이 가능하며 추가적인 메모리 할당 없이도 문자열을 변경할 수 있습니다.
        // append 메서드를 사용하여 문자열을 쉽게 추가할 수 있습니다.
        StringBuilder new_answer = new StringBuilder();

        for (int i=0; i<new_id.length(); i++) {
            // 첫번째부터 차례대로 문자 추출
            // a.charAt(i) 으로 문자열 하나씩 확인
            char c = new_id.charAt(i); 
                
            // 소문자 확인 -> 대문자로 변경
            if (Character.isUpperCase(c)) {
                new_answer.append(Character.toLowerCase(c));
            } else {
                // 대문자가 아니라면 그대로 출력
                new_answer.append(c);
            }
        }
        answer = new_answer.toString(); // StringBuilder를 String으로 변환
        
        //================================================
        // 2단계 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
        
        String pattern = "[^a-z0-9-_.]";
        // Replace all 
        answer = answer.replaceAll(pattern, "");
        
        //================================================
        // 3단계 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
        answer = answer.replaceAll("\\.{2,}", ".");
        
        //================================================
        // 4단계 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        answer = answer.replaceAll("^\\.|\\.$", "");

        //===============================
        // 5단계 빈 문자열이라면, new_id에 "a"를 대입합니다.
        if (answer.length() == 0) {
            answer = "a";
        }
        
        //================================================
        // 6단계 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다. 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }
        answer = answer.replaceAll("\\.$", "");
        //===============================
        // 7단계 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
        
        if(answer.length() <= 2) {
            // 마지막 문자열 받아와서 마지막 문자열 뒤에 추가하기
            // answer = new_id + new_id.charAt(new_id.length() - 1);
            
            char lastChar = answer.charAt(answer.length() - 1);
            while (answer.length() < 3) {
                answer += lastChar;
            }
            
            System.out.println("answer = " + answer);
        }
        
        return answer;
    }
}