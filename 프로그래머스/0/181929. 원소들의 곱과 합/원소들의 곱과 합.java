class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int multi = num_list[0];
        int sum = 0;
        
        for (int i = 0; i < num_list.length; i++) {
            sum += num_list[i];
            if (i >= 1) {
                multi *= num_list[i];
            }
        }
        
        if (multi < sum * sum) {
            answer = 1;
        }
        
        return answer;
    }
}