import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = 0;
        int end = 0;
        int term = 1;
        List<Integer> list = new ArrayList<>();
        
        switch (n) {
            case 1:
                start = 0;
                end = slicer[1];
                break;
            case 2:
                start = slicer[0];
                end = num_list.length - 1;
                break;
            case 3:
                start = slicer[0];
                end = slicer[1];
                break;
            case 4:
                start = slicer[0];
                end = slicer[1];
                term = slicer[2];
                break;
        }
        
        for (int i = start; i <= end; i += term) {
            list.add(num_list[i]);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}