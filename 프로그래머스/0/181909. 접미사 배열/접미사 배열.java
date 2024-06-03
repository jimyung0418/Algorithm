import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> list = new ArrayList<>();
        int idx = 0;
        
        while (idx < my_string.length()) {
            StringBuilder sb = new StringBuilder();
            
            for (int i = idx; i < my_string.length(); i++) {
                char c = my_string.charAt(i);
                sb.append(c);
            }
            
            list.add(sb.toString());
            idx++;
        }
        
        String[] answer = new String[list.size()];
        answer = list.toArray(answer);
        Arrays.sort(answer);
        
        return answer;
    }
}