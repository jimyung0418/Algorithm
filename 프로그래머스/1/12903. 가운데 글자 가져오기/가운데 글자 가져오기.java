class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int length = s.length();
        
        if (length % 2 == 0) {
            sb.append(s.charAt(length / 2 - 1));
            sb.append(s.charAt(length / 2));
        } else {
            sb.append(s.charAt(length / 2));
        }
        
        answer = sb.toString();
        
        return answer;
    }
}