import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            int score = 1;
            int total = 0;
            
            for(int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    total += score;
                    score++;
                } else {
                    score = 1;
                }
            }
            System.out.println(total);
        }
    }
}