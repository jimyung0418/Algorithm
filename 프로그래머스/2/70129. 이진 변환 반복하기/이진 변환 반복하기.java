class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zero = 0;
        int cnt = 0;
        
        while (!s.equals("1")) {
            String str = s.replace("0", "");
            
            zero += s.length() - str.length();
            s = Integer.toBinaryString(str.length());
            
            cnt++;
        }
        
        answer[0] = cnt;
        answer[1] = zero;
        
        return answer;
    }
}