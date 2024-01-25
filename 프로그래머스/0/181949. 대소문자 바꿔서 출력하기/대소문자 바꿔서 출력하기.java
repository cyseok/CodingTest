import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        for (int i=0; i<a.length(); i++) {
            // 소문자 확인 -> 대문자로 변경
            // a.charAt(i) 으로 문자열 하나씩 확인
            if (Character.isLowerCase(a.charAt(i))) {
                // Character.toUpperCase 으로 대문자로 변경
                System.out.print(Character.toUpperCase(a.charAt(i)));
            } else {
                System.out.print(Character.toLowerCase(a.charAt(i)));
            }
        }
    }
}