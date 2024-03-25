class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String numStr = Integer.toString(num);
        String kStr = Integer.toString(k);
        
        if (numStr.contains(kStr)) {
            for (int i = 0; i < numStr.length(); i++) {
                if (numStr.charAt(i) == kStr.charAt(0)) {
                    answer = i + 1;
                    break;
                }
            }
        } else {
            answer = -1;
        }
        
        
        
        return answer;
    }
}