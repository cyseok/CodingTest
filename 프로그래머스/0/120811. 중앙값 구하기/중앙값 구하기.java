class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int tmp = 0;
        
        // 정렬하는 방법
        // Arrays.sort(array);
        
        // 내림차순 정렬
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if(array[i]>array[j]) {
                    tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        // 중앙값 출력
        int a = (array.length -1) / 2;
        return array[a];
    }
}