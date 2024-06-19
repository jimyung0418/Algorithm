class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        boolean isNumeric = true;
        
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                isNumeric = false;
                break;
            }
        }
        
        if (s.length() == 4 || s.length() == 6) {
            if (isNumeric) {
                answer = true;
            }
        }
        
        return answer;
    }
}