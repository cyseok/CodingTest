class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        if(arr.length == 1) {
            answer = new int[]{-1};
            return answer;
        } else {
            int temp = arr[0];
            for(int i =0; i< arr.length; i++) {
                if(arr[i] < temp) {
                    temp = arr[i];
                }
            }
            
            int num = 0;
            answer = new int[arr.length-1];
            
            for(int i=0; i<arr.length; i++) {
                if(arr[i] != temp) {
                    answer[num] = arr[i];
                    num++;
                }
            }
            return answer;
        }
        
    }
}