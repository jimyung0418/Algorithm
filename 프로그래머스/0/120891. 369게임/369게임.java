class Solution {
    public int solution(int order) {
        int answer = 0;
        String orderStr = String.valueOf(order);

        for (int i = 0; i < orderStr.length(); i++) {
            int index = Character.getNumericValue(orderStr.charAt(i));
            if (orderStr.charAt(i) != '0' && index % 3 == 0) {
                answer++;
            }
        }

        return answer;
    }
}