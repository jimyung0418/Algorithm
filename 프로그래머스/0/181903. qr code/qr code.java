class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (i % q == r) {
                sb.append(c);
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}