import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(n);
        
        while (n > 1) {
            if (n % 2 == 0) {
                list.add(n / 2);
                n = n / 2;
            } else {
                list.add(3 * n + 1);
                n = 3 * n + 1;
            }
        }
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}