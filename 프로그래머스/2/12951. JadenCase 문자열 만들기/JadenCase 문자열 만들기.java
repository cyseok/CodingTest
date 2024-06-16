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
            
            if(!Character.isUpperCase(word.charAt(0))) {
                String firstChar = String.valueOf(Character.toUpperCase(word.charAt(0)));
                stb.append(firstChar);
            } else {
                String firstChar = String.valueOf(word.charAt(0));
                stb.append(firstChar);
            }
            
            for(int j = 1; j < word.length(); j++) {
                
                if(Character.isUpperCase(word.charAt(j))) {
                    String otherChar = String.valueOf(Character.toLowerCase(word.charAt(j)));
                    stb.append(otherChar);
                } else {
                    String otherChar = String.valueOf(word.charAt(j));
                    stb.append(otherChar);
                }
            }
            
        }
        
        answer = stb.toString();
        System.out.println(answer);
        
        return answer;
    }
}