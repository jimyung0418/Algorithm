class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int x = sides[0];
        int y = sides[1];
        int max = Math.max(x, y);
        int min = Math.min(x, y);

        // 두 변중 한 변이 가장 긴 변인 경우
        answer += max - (max - min);

        // 나머지 한 변이 가장 긴 변인 경우
        answer += x + y - (max + 1);
        
        return answer;
    }
}