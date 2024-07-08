class Solution {
    public int[] solution(int[] numlist, int n) {
        int length = numlist.length;
        
        for (int i = 0; i < length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < length; j++) {
                int dis1 = Math.abs(numlist[minIdx] - n);
                int dis2 = Math.abs(numlist[j] - n);
                
                if (dis2 < dis1 || (dis2 == dis1 && numlist[j] > numlist[minIdx])) {
                    minIdx = j;                    
                }
            }
            int temp = numlist[minIdx];
            numlist[minIdx] = numlist[i];
            numlist[i] = temp;
        }
        
        return numlist;
    }
}