import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        int B = sc.nextInt();
        int max = 0;
        String answer = "";
        
        if (A % 10 > B % 10) {
            max = A;
        } else if (A % 10 < B % 10) {
            max = B;
        } else {
            if (A % 100 / 10 > B % 100 / 10) {
                max = A;
            } else if (A % 100 / 10 < B % 100 / 10) {
                max = B;
            } else {
                if (A / 100 > B / 100) {
                    max = A;
                } else {
                    max = B;
                }
            }
        }
        
        String s = max + "";
        for (int i = 2; i >= 0; i--) {
            answer += s.charAt(i);
        }
        
        System.out.println(answer);
    }
}