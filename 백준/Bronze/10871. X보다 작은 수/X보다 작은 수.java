import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int length = sc.nextInt();
        int X = sc.nextInt();
        int[] arr = new int[length];
        
        for (int i = 0; i < length; i++) {
            arr[i] = sc.nextInt();
        }
        
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < X) {
                list.add(arr[i]);
            }
        }
        
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}