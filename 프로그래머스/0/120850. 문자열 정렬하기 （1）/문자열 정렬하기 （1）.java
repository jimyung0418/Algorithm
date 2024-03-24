import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < my_string.length(); i++) {
            if (String.valueOf(my_string.charAt(i)).matches("[0-9]")) {
                list.add(Character.getNumericValue(my_string.charAt(i)));
            }
        }

        int[] answer = new int[list.size()];
        
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);            
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}