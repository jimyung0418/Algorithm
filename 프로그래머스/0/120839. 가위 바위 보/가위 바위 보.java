class Solution {
    public String solution(String rsp) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] arr = rsp.split("");

        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "0" -> {
                    sb.append("5");
                }
                case "2" -> {
                    sb.append("0");
                }
                case "5" -> {
                    sb.append("2");
                }
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}