class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        int min = Math.min(M, N);
        int max = Math.max(M, N);
        
        if (min > 1) {
            answer += min - 1;
        }
        
        answer += min * (max - 1);
        
        return answer;
    }
}