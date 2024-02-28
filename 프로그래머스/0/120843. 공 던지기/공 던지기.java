class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int pitcher = 1 + (k-1) * 2;
        int circle = pitcher / numbers.length;
        
        if (pitcher % numbers.length == 0) {
            circle--;
        }
        
        if (pitcher <= numbers.length) {
            answer = pitcher;
        } else {
            answer = pitcher - circle * numbers.length;
            System.out.println(pitcher);
            System.out.println(circle);
        }

        return answer;
    }
}