class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizza = 6;
        
        while (pizza % n != 0) {
            pizza += 6;
            answer++;
        }
        
        answer++;
        
        return answer;
    }
}