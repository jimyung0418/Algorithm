class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s + overwrite_string.length());
        
//         StringBuilder sb = new StringBuilder(my_string);
//         sb.insert(s, overwrite_string);
        
//         answer = sb.toString();
        
        return answer;
    }
}