import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int tmp = 1;
        int rooms = 1;
        int m = 1;
        
        while (tmp < N) {
            tmp += 6 * m;
            m++;
            rooms++;
        }
              
        System.out.println(rooms);
    }
}