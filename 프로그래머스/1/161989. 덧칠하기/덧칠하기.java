class Solution {
    public int solution(int n, int m, int[] section) {
//         int needPaint = section[section.length - 1] - section[0] + 1;
        
//         if (needPaint > m) {
//             answer += needPaint / m;
//             if (needPaint % m != 0) {
//                 answer++;
//             }
//         } else {
//             answer++;
//         }
        int answer = 1;
        int painted = section[0] + m - 1;
        
        for (int i=1; i < section.length; i++) {
            if (painted < section[i]) {
                answer++;
                painted = section[i] + m - 1;
            }
        }
        
        return answer;
    }
}