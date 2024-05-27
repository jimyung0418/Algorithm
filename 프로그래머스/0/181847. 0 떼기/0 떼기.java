class Solution {
    public String solution(String n_str) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for (int i = 0; i < n_str.length(); i++) {
            if (n_str.charAt(i) == '0') {
                idx++;
            } else {
                break;
            }
        }
        
        for (int i = idx; i < n_str.length(); i++) {
            sb.append(n_str.charAt(i));
        }
        
        answer = sb.toString();
        
        return answer;
    }
}