import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] c = s.toCharArray();
        Arrays.sort(c);
        StringBuilder sb = new StringBuilder();
        
        for (int i = c.length - 1; i >= 0; i--) {
            sb.append(c[i]);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}