import java.util.ArrayList;
import java.util.Arrays;


class Solution {
    public int[] solution(int[] numbers) {
        //int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>(); 
        // list.add(1);
        
        for(int i=0; i<numbers.length; i++) {
            int sum = 0;
            for(int j=0; j<i; j++) {
                sum = numbers[i] + numbers[j];
                // list.contains() 를 사용해 배열의 특정 요소가 존재하는지 검색
                if (!list.contains(sum)) {
					list.add(sum);
				}
            }
        }
        
        // ArrayList를 int 배열로 변환
        int[] answer = new int[list.size()];
        // list.size()는 ArrayList의 요소 수를 반환합니다.
        for (int i = 0; i < list.size(); i++) {
            // list.get(i)를 사용하여 해당 요소를 검색
            answer[i] = list.get(i);
        }
        
        // 오름차순 정렬
        Arrays.sort(answer);
        
        System.out.println(list);
        
        return answer;
    }
}