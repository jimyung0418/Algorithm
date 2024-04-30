import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<String>();

        for (int i = 0; i < words.length; i++) {
            if (i > 0) {
                String before = words[i - 1];
                if (words[i].charAt(0) != before.charAt(before.length() - 1) || list.contains(words[i])) {
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
                }
            }
            
            list.add(words[i]);
        }

        return answer;
    }
}