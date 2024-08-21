import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        
        int[] arr = new int[26];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            int idx = c - 'a';
            
            if (arr[idx] == -1) {
                arr[idx] = i;
            }
        }
        
        for (int i = 0; i < 26; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}