class Solution {
    public String solution(String new_id) {
        String answer = "";
        
        // 1단계
        new_id = new_id.toLowerCase();
        
        // 2단계
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < new_id.length(); i++) {
            char c = new_id.charAt(i);
            if (Character.isAlphabetic(c) ||
                Character.isDigit(c) ||
                c == '-' || c == '_' || c == '.') {
                sb.append(c);
            }            
        }
        
        // 3단계
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '.' && sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == '.') {
                continue;
            }
            sb2.append(sb.charAt(i));
        }
        
        // 4단계
        if (sb2.length() > 0 && sb2.charAt(0) == '.') {
            sb2.deleteCharAt(0);
        }
        if (sb2.length() > 0 && sb2.charAt(sb2.length() - 1) == '.') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        
        // 5단계
        if (sb2.length() == 0) {
            sb2.append("a");
        }
        
        // 6단계
        if (sb2.length() > 15) {
            sb2.setLength(15);
            if (sb2.charAt(sb2.length() - 1) == '.') {
                sb2.deleteCharAt(sb2.length() - 1);
            }
        }
        
        // 7단계
        while (sb2.length() < 3) {
            sb2.append(sb2.charAt(sb2.length() - 1));
        }
        
        answer = sb2.toString();
        
        return answer;
    }
}