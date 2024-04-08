class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        
        for (int i = min; i > 0; i--) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                break;
            }
        }
        
        int tmp = max;
        
        while (true) {
            if (tmp % min == 0) {
                answer[1] = tmp;
                return answer;
            }
            tmp += max;
        }
    }
}