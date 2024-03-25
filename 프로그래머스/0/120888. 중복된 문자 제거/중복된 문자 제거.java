class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < my_string.length(); i++) {
            String index = String.valueOf(my_string.charAt(i));
            if (!sb.toString().contains(index)) {
                sb.append(my_string.charAt(i));
            }
        }

        String answer = sb.toString();

        return answer;
    }
}