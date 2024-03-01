class Solution {
    public int solution(int n, int k) {
        int service = n / 10;
        int drinks = 2000 * (k - service);
        int answer = 12000 * n + drinks;
        
        return answer;
    }
}