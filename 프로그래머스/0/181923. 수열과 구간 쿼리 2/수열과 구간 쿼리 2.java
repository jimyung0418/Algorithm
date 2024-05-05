class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int i = 0; i < queries.length; i++) {
            int temp = Integer.MAX_VALUE;
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                if (arr[j] > queries[i][2] && arr[j] < temp) {
                    temp = arr[j];
                }
            }
            if (temp == Integer.MAX_VALUE) {
                temp = -1;
            }
            answer[i] = temp;
        }
        
        return answer;
    }
}