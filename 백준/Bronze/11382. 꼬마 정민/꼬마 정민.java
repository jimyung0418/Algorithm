import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String input = sc.nextLine();
        String[] arr = input.split(" ");
        
        long A = Long.parseLong(arr[0]);
        long B = Long.parseLong(arr[1]);
        long C = Long.parseLong(arr[2]);
        
        System.out.println(A + B + C);
    }
}