class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] newNum = new int[100];
        
        int num = 1;
        for (int i = 0; i < newNum.length; ) {
            if (num % 3 != 0 && !Integer.toString(num).contains("3")) {
                newNum[i] = num;
                i++;
            }
            num++;
        }
        
        answer = newNum[n - 1];
        
        return answer;
    }
}