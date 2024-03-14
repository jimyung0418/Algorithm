class Solution {
    public int solution(String my_string) {
        int answer = 0;

        for (int i = 0; i < my_string.length(); i++) {
            StringBuilder sb = new StringBuilder();
            
            if (Character.isDigit(my_string.charAt(i))) {
                sb.append(my_string.charAt(i));
                String number = sb.toString();
                answer += Integer.parseInt(number);
            }
        }

        return answer;
    }
}