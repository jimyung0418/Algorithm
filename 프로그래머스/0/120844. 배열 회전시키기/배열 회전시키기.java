import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if (Objects.equals(direction, "left")) {
            answer[numbers.length - 1] = numbers[0];
            for (int i = 0; i < answer.length - 1; i++) {
                answer[i] = numbers[i + 1];
            }
        } else if (Objects.equals(direction, "right")) {
            answer[0] = numbers[numbers.length - 1];
            for (int j = 1; j < answer.length; j++) {
                answer[j] = numbers[j - 1];
            }
        }
        
        return answer;
    }
}