class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i <= n; i++) {
            int divCount = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divCount++;
                }
            }
            if (divCount >= 3) {
                answer++;
            }
        }
        
        return answer;
    }
}