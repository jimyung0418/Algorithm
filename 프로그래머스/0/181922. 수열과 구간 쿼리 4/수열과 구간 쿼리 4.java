class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            for (int j = 0; j < arr.length; j++) {
                if (j >= s && j <= e && j % k == 0) {
                    arr[j] += 1;
                }
            }
        }
        
        int[] answer = arr;
        
        return answer;
    }
}