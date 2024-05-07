import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        
        for (int i = 0; i < picture.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < picture[i].length(); j++) {
                for (int l = 0; l < k; l++) {
                    sb.append(picture[i].charAt(j));
                }
            }
            for (int j = 0; j < k; j++) {
                list.add(sb.toString());
            }
        }
        
        String[] answer = new String[list.size()];
        answer = list.toArray(answer);
        return answer;
    }
}