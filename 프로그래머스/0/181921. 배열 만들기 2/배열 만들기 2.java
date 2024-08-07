import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = l; i <= r; i++) {
            String str = Integer.toString(i);
            boolean flag = true;
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c != '0' && c != '5') {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(i);
            }
        }
        
        if (list.isEmpty()) {
            list.add(-1);
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}