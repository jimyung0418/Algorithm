import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        sc.nextLine();
        int B = sc.nextInt();
        sc.nextLine();
        int C = sc.nextInt();
        
        String s = A * B * C + "";
        
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) - '0' == i) {
                    arr[i]++;
                }
            }
            System.out.println(arr[i]);
        }
    }
}