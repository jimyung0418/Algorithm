import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int C = sc.nextInt();
        
        for (int i = 0; i < C; i++) {
            int p = sc.nextInt();
            int[] scores = new int[p];
            double sum = 0;
            
            for (int j = 0; j < p; j++) {
                scores[j] = sc.nextInt();
                sum += scores[j];
            }
            
            double average = sum / p;
            
            int cnt = 0;
            for (int j = 0; j < scores.length; j++) {
                if (scores[j] > average) {
                    cnt++;
                }
            }
            
            double ratio = (double) cnt / p * 100;
            
            System.out.printf("%.3f%%%n", ratio);
        }
    }
}