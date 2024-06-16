class Solution {
    public String solution(String s) {
        String answer = "";
        //String[] str = s.split(" ");
        String[] str = s.split("(?<=\\s)|(?=\\s)");
        System.out.println(str[0]);
        System.out.println(str[0].charAt(0));
        
        StringBuilder stb = new StringBuilder();
        
        // Character 클래스의 isLowerCase 사용할때는 char형식만 가능하기 때문에 charAt 사용
        for (int i = 0; i < str.length; i++) {
            
            String word = str[i];
            
            // 분리된 단어의 첫글자를 소문자라면 대문자로 변경해줌
            if(!Character.isUpperCase(word.charAt(0))) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                stb.append(firstChar);
            } else {
                char firstChar = word.charAt(0);
                stb.append(firstChar);
            }
            
            // 분리된 단어의 두번째 글자부터 대문자가 있다면 소문자로 변경해줌
            for(int j = 1; j < word.length(); j++) {
                
                if(Character.isUpperCase(word.charAt(j))) {
                    //String otherChar = String.valueOf(Character.toLowerCase(word.charAt(j)));
                    char otherChar = Character.toLowerCase(word.charAt(j));
                    stb.append(otherChar);
                } else {
                    char otherChar = word.charAt(j);
                    stb.append(otherChar);
                }
            }
            
        }
        
        answer = stb.toString();
        System.out.println(answer);
        
        return answer;
    }
}