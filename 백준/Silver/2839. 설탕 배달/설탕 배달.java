import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int sugar = 0;
        
        while (N >= 0) {
            if (N % 5 == 0) {
                sugar += N / 5;
                System.out.println(sugar);
                return;
            }
            N -= 3;
            sugar++;
        }
        
        System.out.println(-1);
    }
}