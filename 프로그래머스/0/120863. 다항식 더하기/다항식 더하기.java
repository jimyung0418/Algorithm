class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String[] arr = polynomial.split(" \\+ ");
        int x = 0;
        int a = 0;
        
        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i].contains("x")) {
                if (arr[i].length() >= 2) {
                    x += Integer.parseInt(arr[i].substring(0, arr[i].length() - 1));
                } else {
                    x++;
                }
            } else {
                a += Integer.parseInt(arr[i]);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        if (x != 0) {
            if (x == 1) {
                sb.append("x");
            } else {
                sb.append(x);
                sb.append("x");
            }
        }
        
        if (a != 0) {
            if (sb.length() == 0) {
                sb.append(a);
            } else {
                sb.append(" + ");
                sb.append(a);
            }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}