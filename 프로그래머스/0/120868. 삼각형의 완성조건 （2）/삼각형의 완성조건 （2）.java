class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int x = sides[0];
        int y = sides[1];

        // 두 변중 한 변이 가장 긴 변인 경우
        answer += Math.max(x,y) - (Math.max(x,y) - Math.min(x,y));

        // 나머지 한 변이 가장 긴 변인 경우
        answer += x + y - (Math.max(x,y) + 1);
        
        return answer;
    }
}