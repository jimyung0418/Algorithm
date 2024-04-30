class Solution {
    public int solution(String A, String B) {
        int answer = 0;

        if (A.equals(B)) {
            return answer;
        }

        while (!A.equals(B)) {
            A = A.charAt(A.length() - 1) + A.substring(0, A.length() - 1);
            answer++;
            if (A.equals(B)) {
                return answer;
            }
            if (answer >= A.length()) {
                return -1;
            }
        }

        return answer;
    }
}