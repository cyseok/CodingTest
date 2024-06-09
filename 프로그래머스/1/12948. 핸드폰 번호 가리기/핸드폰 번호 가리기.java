class Solution {
    public String solution(String phone_number) {
        
 int pNumber = phone_number.length() - 4;
            
            
String hideNumber = "*".repeat(pNumber) + phone_number.substring(pNumber);

    return hideNumber;

    }
}