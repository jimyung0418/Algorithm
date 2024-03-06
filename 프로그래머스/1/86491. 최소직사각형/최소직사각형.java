class Solution {
    public int solution(int[][] sizes) {
        int longSideMax = 0;
        int shortSideMax = 0;
        
        for (int i = 0; i < sizes.length; i++) {
            int longSide = Math.max(sizes[i][0], sizes[i][1]);
            int shortSide = Math.min(sizes[i][0], sizes[i][1]);
            
            if (longSide > longSideMax) {
                longSideMax = longSide;
            }
            
            if (shortSide > shortSideMax) {
                shortSideMax = shortSide;
            }
        }
        

        return longSideMax * shortSideMax;
    }
}

// 1. 긴쪽과 짧은쪽으로 비교
// 2. 가장긴쪽 최대, 가장 짧은쪽 쵀대 구하기
// 3. 가장 긴 * 가장 짧은