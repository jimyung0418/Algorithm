import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> hm = new HashMap<>();

        for (int i = 0; i < participant.length; i++) {
            hm.put(participant[i], hm.getOrDefault(participant[i], 0) + 1);
        }

        for (int i = 0; i < completion.length; i++) {
            hm.put(completion[i], hm.get(completion[i])-1);
        }

        for (int i = 0; i < participant.length; i++) {
            if (hm.get(participant[i]) == 1) {
                answer = participant[i];
            }
        }

        return answer;
    }
}