class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String str = my_string.substring(s, e + 1);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s; i++) {
            sb.append(my_string.charAt(i));
        }
        
        for (int i = str.length() - 1; i >= 0 ; i--) {
            sb.append(str.charAt(i));
        }
        
        for (int i = e + 1; i < my_string.length(); i++) {
            sb.append(my_string.charAt(i));
        }
        
        answer = sb.toString();
        
        return answer;
    }
}