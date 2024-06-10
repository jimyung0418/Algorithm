import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < strArr.length; i++) {
            int length = strArr[i].length();
            map.put(length, map.getOrDefault(length, 0) + 1);
        }
        
        Set<Integer> set = map.keySet();
        for (int key : set) {
            int value = map.get(key);
            answer = Math.max(answer, value);
        }
        
        return answer;
    }
}