class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char[][] arr = new char[my_string.length() / m][m];
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = my_string.charAt(idx);
                idx++;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i][c - 1]);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}