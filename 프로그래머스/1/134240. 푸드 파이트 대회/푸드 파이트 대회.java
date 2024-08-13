class Solution {
    public String solution(int[] food) {
        String answer = "";
        int[] arr = new int[food.length];
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < food.length; i++) {
            if (food[i] % 2 != 0) {
                arr[i] = food[i] - 1;
            }
            
            arr[i] = food[i];
        }
        
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i] / 2; j++) {
                sb.append(i);
            }
        }
        
        sb.append(0);
        
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < arr[i] / 2; j++) {
                sb.append(i);
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}