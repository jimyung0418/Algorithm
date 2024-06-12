import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = -1;
        int[] temp = new int[arr.length];
        
        while (!Arrays.equals(arr, temp)) {
            temp = Arrays.copyOf(arr, arr.length);
                
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            
            answer++;
        }
        
        
        return answer;
    }
}