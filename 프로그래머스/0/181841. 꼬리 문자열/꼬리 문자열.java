class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < str_list.length; i++) {
            if (!str_list[i].contains(ex)) {
                sb.append(str_list[i]);
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}