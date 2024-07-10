import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();        
        
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        
        StringBuilder number = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isLetter(c)) {
                number.append(c);
            } else {
                sb.append(c);
            }
            
            if (map.containsKey(number.toString())) {
                sb.append(map.get(number.toString()));
                number.setLength(0);
            }
        }
        
        answer = Integer.parseInt(sb.toString());
        
        return answer;
    }
}