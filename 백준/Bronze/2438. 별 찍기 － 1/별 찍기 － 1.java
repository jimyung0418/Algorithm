import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        for (int i = 1; i <= num; i++) {
            int tmp = i;
            while (tmp != 0) {
                System.out.print("*");
                tmp--;
            }
            System.out.println();
        }
    }
}