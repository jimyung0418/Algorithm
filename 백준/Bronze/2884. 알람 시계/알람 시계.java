import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String time = sc.nextLine();
        String[] arr = time.split(" ");
        int H = Integer.parseInt(arr[0]);
        int M = Integer.parseInt(arr[1]);
        
        if (M < 45) {
            if (H > 0) {
                H -= 1;
            } else {
                H = 23;
            }
            M = 60 - (45 - M);
        } else {
            M -= 45;
        }
        
        System.out.println(H + " " + M);        
    }
}