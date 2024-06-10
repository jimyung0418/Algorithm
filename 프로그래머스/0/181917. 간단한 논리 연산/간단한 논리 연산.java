class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = false;
        boolean left = true;
        boolean right = true;
        
        if (!x1 && !x2) {
            left = false;
        }
        
        if (!x3 && !x4) {
            right = false;
        }
        
        if (left && right) {
            answer = true;
        }
        
        return answer;
    }
}