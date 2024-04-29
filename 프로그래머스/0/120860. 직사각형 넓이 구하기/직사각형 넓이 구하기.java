class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int xMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMax = Integer.MIN_VALUE;
        int yMin = Integer.MAX_VALUE;
        
        for (int i = 0; i < dots.length; i++) {
            if (dots[i][0] > xMax) {
                xMax = dots[i][0];
            }
            if (dots[i][0] < xMin) {
                xMin = dots[i][0];
            }
            if (dots[i][1] > yMax) {
                yMax = dots[i][1];
            }
            if (dots[i][1] < yMin) {
                yMin = dots[i][1];
            }
        }
        
        answer = (xMax - xMin) * (yMax - yMin);
        
        return answer;
    }
}