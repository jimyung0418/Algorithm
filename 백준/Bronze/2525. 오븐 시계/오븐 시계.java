import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] currentTime = new int[2];
        currentTime[0] = sc.nextInt();
        currentTime[1] = sc.nextInt();
        sc.nextLine();
        
        int requiredTime = sc.nextInt();
        
        int[] endTime = new int[2];
        endTime[0] = currentTime[0] + requiredTime / 60;
        endTime[1] = currentTime[1] + requiredTime % 60;
        
        if (endTime[1] >= 60) {
            endTime[0] += endTime[1] / 60;
            endTime[1] = endTime[1] % 60;
        }
        
        if (endTime[0] >= 24) {
            endTime[0] = endTime[0] % 24;
        }
        
        System.out.println(endTime[0] + " " + endTime[1]);
    }
}