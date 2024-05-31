import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        List<String> list = new ArrayList<>();
        String[] str = my_string.split(" ");
        
        for (int i = 0; i < str.length; i++) {
            if (!str[i].equals("")) {
                list.add(str[i]);
            }
        }
        
        answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}