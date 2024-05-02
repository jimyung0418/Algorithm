class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        my_string = my_string.substring(0, s) + my_string.substring(s + overwrite_string.length());
        
        StringBuilder sb = new StringBuilder(my_string);
        sb.insert(s, overwrite_string);
        
        answer = sb.toString();
        
        return answer;
    }
}

// class Solution {
//     public String solution(String my_string, String overwrite_string, int s) {
//         StringBuilder target = new StringBuilder();
        
//         for (int i = s; i < overwrite_string.length() + s; i++) {
//             target.append(my_string.charAt(i));
//         }
        
//         String answer = my_string.replace(target.toString(), overwrite_string);
        
//         return answer;
//     }
// }