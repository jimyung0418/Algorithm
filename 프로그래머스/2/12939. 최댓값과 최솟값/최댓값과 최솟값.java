class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        String max = arr[0];
        String min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(Integer.parseInt(max), Integer.parseInt(arr[i])) + "";
            min = Math.min(Integer.parseInt(min), Integer.parseInt(arr[i])) + "";
        }
        
        sb.append(min);
        sb.append(" ");
        sb.append(max);
        
        answer = sb.toString();
        
        return answer;
    }
}