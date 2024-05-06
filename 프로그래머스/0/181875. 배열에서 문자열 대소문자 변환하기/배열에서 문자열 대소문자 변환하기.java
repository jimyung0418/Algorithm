class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        
        for (int i = 0; i < strArr.length; i++) {
            char[] arr = strArr[i].toCharArray();
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = Character.toLowerCase(arr[j]);
                }
            } else {
                for (int j = 0; j < arr.length; j++) {
                    arr[j] = Character.toUpperCase(arr[j]);
                }
            }
            answer[i] = new String(arr);
        }
        
        return answer;
    }
}