import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        String[] str = myStr.split("[abc]");
        
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length; i++) {
            if (!str[i].isEmpty()) {
                list.add(str[i]);
            }
        }
        
        if (list.size() == 0) {
            list.add("EMPTY");
        }
        
        String[] answer = new String[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}