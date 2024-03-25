import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }

        Arrays.sort(arr);
        answer = new String(arr);

        return answer;
    }
}