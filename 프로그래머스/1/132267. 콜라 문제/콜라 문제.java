class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int bottle = 0;
        
        int coke = b * (n / a);
        answer += coke;
        bottle = coke + n % a;
        
        while (bottle >= a) {
            coke = b * (bottle / a);
            answer += coke;
            bottle = coke + bottle % a;
        }
        
        
        
        
        return answer;
    }
}