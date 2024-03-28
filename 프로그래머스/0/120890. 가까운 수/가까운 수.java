class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int distance = Math.abs(array[0] - n);
        int minIdx = 0;
        
        for (int i = 1; i < array.length; i++) {
            int temp = Math.abs(array[i] - n);
            if (temp < distance || temp == distance && array[i] < array[minIdx]) {
                distance = temp;
                minIdx = i;
            }
        }
        
        answer = array[minIdx];
        
        return answer;
    }
}