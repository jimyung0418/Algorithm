class Solution {
    public String solution(String s) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ", -1);
        
        for (int i = 0; i < arr.length; i++) {
            String str = arr[i];
            StringBuilder word = new StringBuilder();

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (j == 0 && Character.isLetter(c)) {
                    word.append(Character.toUpperCase(c));
                } else {
                    word.append(Character.toLowerCase(c));
                }
            }
            
            arr[i] = word.toString();
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                sb.append(" ");
            }
            
            sb.append(arr[i]);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}