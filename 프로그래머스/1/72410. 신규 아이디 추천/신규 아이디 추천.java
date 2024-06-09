class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        StringBuilder stb = new StringBuilder();
        
        for(int i=0; i<new_id.length(); i++) {
            char c = new_id.charAt(i);
            
            if(Character.isUpperCase(c)) {
                c = Character.toLowerCase(c);
                stb.append(c);
            } else {
                stb.append(c);
            }
        }
        answer = stb.toString();
        System.out.println("1단계 소문자로 변경 : "+stb);
        
        answer = answer.replaceAll("[^a-z0-9-_.]","");
        answer = answer.replaceAll("\\.{2,}",".");
        answer = answer.replaceAll("^\\.|\\.$","");
        
        if(answer.length() == 0) {
            answer = "a";
        }
        
        if(answer.length() >= 16) {
            answer = answer.substring(0,15);
        }
        answer = answer.replaceAll("\\.$","");
        
        if (answer.length() <= 2) {
            char last = answer.charAt(answer.length()-1);
            while(answer.length() < 3) {
                answer += last;
            }
        }
            
        System.out.println(answer);
        return answer;
    }
}