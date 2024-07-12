class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for (int i = 0; i < quiz.length; i++) {
            String[] arr = quiz[i].split(" ");
            int temp = Integer.parseInt(arr[0]);
            
            if (arr[1].equals("+")) {
                temp += Integer.parseInt(arr[2]);
            } else {
                temp -= Integer.parseInt(arr[2]);
            }
            
            if (temp == Integer.parseInt(arr[4])) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }
        
        return answer;
    }
}