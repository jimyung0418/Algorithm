class Solution {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < myString.length(); i++) {
            sb.append(Character.toUpperCase(myString.charAt(i)));
        }
        
        String answer = sb.toString();
        
        return answer;
    }
}