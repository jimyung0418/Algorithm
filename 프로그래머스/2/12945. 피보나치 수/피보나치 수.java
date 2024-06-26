class Solution {
    public int solution(int n) {
        int answer = 0;
        int dp[] = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                dp[i] = 0;
            } else if (i == 1) {
                dp[i] = 1;
            } else {
                int j = dp[i - 2] + dp[i - 1];
                dp[i] = j % 1234567; 
            }
        }
        
        answer = dp[n];
        
        return answer;
    }
}