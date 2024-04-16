import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0;
        Queue<Character> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        StringBuilder toNum = new StringBuilder();

        for (int i = 0; i < numbers.length(); i++) {
            queue.offer(numbers.charAt(i));
        }

        while (!queue.isEmpty()) {
            sb.append(queue.poll());
            switch (sb.toString()) {
                case "zero":
                    toNum.append("0");
                    sb.setLength(0);
                    break;
                case "one":
                    toNum.append("1");
                    sb.setLength(0);
                    break;
                case "two":
                    toNum.append("2");
                    sb.setLength(0);
                    break;
                case "three":
                    toNum.append("3");
                    sb.setLength(0);
                    break;
                case "four":
                    toNum.append("4");
                    sb.setLength(0);
                    break;
                case "five":
                    toNum.append("5");
                    sb.setLength(0);
                    break;
                case "six":
                    toNum.append("6");
                    sb.setLength(0);
                    break;
                case "seven":
                    toNum.append("7");
                    sb.setLength(0);
                    break;
                case "eight":
                    toNum.append("8");
                    sb.setLength(0);
                    break;
                case "nine":
                    toNum.append("9");
                    sb.setLength(0);
                    break;
            }
        }

        answer = Long.parseLong(toNum.toString());

        return answer;
    }
}