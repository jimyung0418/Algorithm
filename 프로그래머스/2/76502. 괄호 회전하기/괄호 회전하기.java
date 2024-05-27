import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            String str = s.substring(i, s.length()) + s.substring(0, i);
            Stack<Character> stack = new Stack<>();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (stack.isEmpty()) {
                    stack.push(c);
                } else if ((stack.peek() == '(' && c == ')') ||
                          (stack.peek() == '{' && c == '}') ||
                          (stack.peek() == '[' && c == ']')) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }
            
            if (stack.isEmpty()) {
                answer++;
            }
        }
        
        return answer;
    }
}