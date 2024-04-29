class Solution {
    public int[] solution(String[] keyinput, int[] board) {
    int[] answer = new int[2];
    int xRange = board[0] / 2;
    int yRange = board[1] / 2;

    for (String input : keyinput) {
        switch (input) {
            case "left":
                if (Math.abs(answer[0] - 1) <= xRange) {
                    answer[0]--;
                }
                break;
            case "right":
                if (Math.abs(answer[0] + 1) <= xRange) {
                    answer[0]++;
                }
                break;
            case "up":
                if (Math.abs(answer[1] + 1) <= yRange) {
                    answer[1]++;
                }
                break;
            case "down":
                if (Math.abs(answer[1] - 1) <= yRange) {
                    answer[1]--;
                }
                break;
        }
    }

    return answer;
}

}