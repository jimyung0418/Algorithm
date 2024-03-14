class Solution {
    public int solution(int n) {
        int answer = 0;
        double i = Math.sqrt(n);
        double j = Math.floor(i);
        
        if (j * j == n) {
            answer = 1;
        } else {
            answer = 2;
        }
        
        
        return answer;
    }
}