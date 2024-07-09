import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < rank.length; i++) {
            map.put(rank[i], i);
        }
        
        for (int i = 1; i <= rank.length; i++) {
            int idx = map.get(i);
            if (attendance[idx]) {
                list.add(idx);
            }
            
            if (list.size() == 3) {
                break;
            }
        }
        
        answer = 10000 * list.get(0) + 100 * list.get(1) + list.get(2);
        
        return answer;
    }
}
