import java.util.*;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                sb.append(ch);
            }
        }

        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        String answer = new String(arr);

        return answer;
    }
}