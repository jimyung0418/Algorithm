import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        
        // while (left <= right) {
        //     if (people[left] + people[right] <= limit) {
        //         left++;
        //         right--;
        //         answer++;
        //     } else {
        //         right--;
        //         answer++;
        //     }
        // }
        
        for (int i = right; i >= left; i--) {
            if (people[i] + people[left] <= limit) {
                left++;
            }
            answer++;
        }
        
        return answer;
    }
}