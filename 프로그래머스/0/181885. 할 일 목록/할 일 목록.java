import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        Map<String, Boolean> map = new HashMap<>();
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < todo_list.length; i++) {
            map.put(todo_list[i], finished[i]);
        }
        
        for (int i = 0; i < todo_list.length; i++) {
            if (map.get(todo_list[i]) == false) {
                list.add(todo_list[i]);
            }
        }
        
        answer = list.toArray(new String[list.size()]);
        
        return answer;
    }
}