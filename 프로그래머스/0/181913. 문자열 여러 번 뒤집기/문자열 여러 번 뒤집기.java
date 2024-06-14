class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1] + 1;
            String target = sb.substring(start, end);
            String reverse = new StringBuilder(target).reverse().toString();
            
            sb.replace(start, end, reverse);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}