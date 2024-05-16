class Solution {
    public String[] solution(String[] names) {
        int length = 0;
        if (names.length % 5 == 0) {
            length = names.length / 5;
        } else {
            length = (int)(names.length / 5) + 1;
        }
        
        String[] answer = new String[length];
        int idx = 0;
        
        for (int i = 0 ; i < names.length; i++) {
            if (i == 0 || i % 5 == 0) {
                answer[idx] = names[i];
                idx++;
            }
        }
        
        return answer;
    }
}