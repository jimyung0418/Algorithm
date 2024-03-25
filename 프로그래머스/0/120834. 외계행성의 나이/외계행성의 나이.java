class Solution {
    public String solution(int age) {
        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char[] ageChar = Integer.toString(age).toCharArray();
        char[] answerArr = new char[ageChar.length];

        for (int i = 0; i < ageChar.length; i++) {
            int index = Character.getNumericValue(ageChar[i]);
            answerArr[i] = alphabet[index];
        }

        String answer = new String(answerArr);

        return answer;
    }
}