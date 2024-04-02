class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String str = "";
        
        for (int l = i; l <= j; l++) {
            str += l;
        }
        
        for (int m = 0; m < str.length(); m++) {
            if (str.charAt(m) == String.valueOf(k).charAt(0)) {
                answer++;
            }
        }
        
        return answer;
    }
}