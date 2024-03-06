class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;

        for (int i = 0; i < dic.length; i++) {
            int contains = 0;
            for (int j = 0; j < spell.length; j++) {
                if (dic[i].contains(spell[j])) {
                    contains++;
                }
            }
            if (contains == spell.length) {
                answer -= 1;
                // break;
            }
        }

        return answer;
    }
}