import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int start = 0;
        int end = 0;
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] == 2) {
                start = i;
                break;
            }
        }
        
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 2) {
                end = i;
                break;
            }
        }
        
        for (int i = start; i <= end; i++) {
            if (start == 0 && end == 0) {
                list.add(-1);
                break;
            } else if (start == end) {
                list.add(2);
                break;
            }
            
            list.add(arr[i]);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}