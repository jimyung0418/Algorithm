import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append("??!");
        
        System.out.println(sb.toString());
    }
}