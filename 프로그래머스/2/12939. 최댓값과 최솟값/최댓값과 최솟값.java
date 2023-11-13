class Solution {
    public String solution(String answer) {
        
// 공백을 기준으로 배열로 바꿔준다.
String[] list = answer.split(" ");

// list 문자열을 정수로 변환해주고, 최소값과 최대값을 선언해준다.
// list[0] 으로 선언해 만약 그 뒤에 나오는 수들이 더 작은 수가 없다면 min을 list[0]으로 선언
      int min = Integer.parseInt(list[0]);
      int max = Integer.parseInt(list[0]);
      int num = 0;
      
// 배열을 하나씩 뽑아서 크거나 작다면 바꿔준다.    
    for(int i = 0; i<list.length; i++) {
       num = Integer.parseInt(list[i]);
 
         if(min > num) {
             min = num; 
          } else if(max < num )  {
             max = num;
         }
       }
        return min + " " + max;
    }
}