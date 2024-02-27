class Solution {
    public int solution(String s) {
        
        int answer = 0;
        char x = 0;
        int countX = 0;
        int countY = 0;

        for (int i = 0; i < s.length(); i++) {
            if (x == 0) {
                x = s.charAt(i);
            }

            if (x == s.charAt(i)) {
                countX++;
            } else {
                countY++;
            }

            if (countX == countY) {                
                x = 0;
                countX = 0;
                countY = 0;
                answer++;
            }
        }
        
        if (countX != 0) {
            answer++;
        }

        return answer;
    }
}