import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String N = sc.nextLine();
        if (N.length() < 2) {
            StringBuilder sb = new StringBuilder();
            sb.append(0);
            sb.append(N);
            N = sb.toString();
        }
        
        String sum = (N.charAt(0) - '0') + (N.charAt(1) - '0') + "";
        String result = "" + N.charAt(1) + sum.charAt(sum.length() - 1);
        int cycle = 1;
        
        while (!result.equals(N)) {
            sum = (result.charAt(0) - '0') + (result.charAt(1) - '0') + "";
            result = "" + result.charAt(1) + sum.charAt(sum.length() - 1);
            cycle++;
        }
        
        System.out.println(cycle);
    }
}