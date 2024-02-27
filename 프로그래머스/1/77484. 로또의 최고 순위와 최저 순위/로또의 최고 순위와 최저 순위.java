class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int min = 0;
        int zero = 0;
        
        int minRate = 0;
        int maxRate = 0;


        for (int i = 0; i < 6; i++) {
            if (lottos[i] == 0) {
                zero++;
            }
            for (int j = 0; j < 6; j++) {
                if (lottos[i] == win_nums[j]) {
                    min++;
                }
            }
        }

        int max = min + zero;

        switch (min) {
            case 0:
                minRate = 6;
                break;
            case 1:
                minRate = 6;
                break;
            case 2:
                minRate = 5;
                break;
            case 3:
                minRate = 4;
                break;
            case 4:
                minRate = 3;
                break;
            case 5:
                minRate = 2;
                break;
            case 6:
                minRate = 1;
        }

        switch (max) {
            case 0:
                maxRate = 6;
                break;
            case 1:
                maxRate = 6;
                break;
            case 2:
                maxRate = 5;
                break;
            case 3:
                maxRate = 4;
                break;
            case 4:
                maxRate = 3;
                break;
            case 5:
                maxRate = 2;
                break;
            case 6:
                maxRate = 1;
        }
        int[] answer = {maxRate, minRate};

        return answer;
    }
}

// 1. 숫자가 일치하는 갯수를 구한다. = 최소 등수
// 2. 0의 갯수를 구해서 일치하는 숫자 갯수에 더한다. = 최고 등수