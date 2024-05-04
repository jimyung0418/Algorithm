class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int[] numbers = new int[included.length];
        
        numbers[0] = a;
        for (int i = 1; i < numbers.length; i++) {
            a += d;
            numbers[i] = a;
        }
        
        for (int i = 0; i < included.length; i++) {
            if (included[i] == true) {
                answer += numbers[i];
            }
        }
        
        return answer;
    }
}