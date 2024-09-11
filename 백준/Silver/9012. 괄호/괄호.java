import java.util.Scanner;
import java.util.Stack;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < T; i++) {
            Stack<Character> stack = new Stack<>();
            String s = sc.nextLine();
            boolean isVPX = true;
            
            for (char c : s.toCharArray()) {
                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        isVPX = false;
                        break;
                    }
                    
                    stack.pop();
                }
            }
            
            if (isVPX) {
                if (stack.isEmpty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}