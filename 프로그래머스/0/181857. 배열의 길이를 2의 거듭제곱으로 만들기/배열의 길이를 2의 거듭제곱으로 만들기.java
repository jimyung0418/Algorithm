class Solution {
    public int[] solution(int[] arr) {
        int[] answer = arr;
        
        int length = arr.length;
        boolean flag = false;
        int temp = 1;
        
        while (temp < length) {
            temp *= 2;
        }
        if (temp == length) {
            flag = true;
        }
        
        if (!flag) {
            int target = temp;
            int[] newArr = new int[target];
            for (int i = 0; i < length; i++) {
                newArr[i] = arr[i];
            }
            
            return newArr;
        }
        
        return answer;
    }
}