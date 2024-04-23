import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            map.put(array[i], map.getOrDefault(array[i], 0) + 1);
        }

        int max = 0;
        for (int key : map.keySet()) {
            int temp = map.get(key);
            if (temp > max) {
                max = temp;
                answer = key;
            }
        }
        
        int cnt = 0;
        for (int value : map.values()) {
            if (value == max) {
                cnt++;
            }
        }
        
        if (cnt > 1) {
            return -1;
        }
        
        return answer;
    }
}