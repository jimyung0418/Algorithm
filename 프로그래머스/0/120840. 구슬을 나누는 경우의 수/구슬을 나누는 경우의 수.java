import java.math.BigInteger;

class Solution {
    public long solution(int balls, int share) {
        BigInteger ballsF = BigInteger.ONE;
        BigInteger shareF = BigInteger.ONE;
        int a = balls - share;
        BigInteger aF = BigInteger.ONE;
        
        for (int i = 1; i <= balls; i++) {
            ballsF = ballsF.multiply(BigInteger.valueOf(i));
        }
        
        for (int j = 1; j <= share; j++) {
            shareF = shareF.multiply(BigInteger.valueOf(j));
        }
        
        for (int k = 1; k <= a; k++) {
            aF = aF.multiply(BigInteger.valueOf(k));
        }
        
        BigInteger answer = ballsF.divide(shareF.multiply(aF));

        
        return answer.longValue();
    }
}