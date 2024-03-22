class Solution {
    public long solution(int price, int money, int count) {
        long total = 0;
        
        for (int i = 1; i <= count; i++) {
            total += price * i;
        }
        
        long answer = total - money;
        
        if (answer < 0) {
            answer = 0;
        }

        return answer;
    }
}