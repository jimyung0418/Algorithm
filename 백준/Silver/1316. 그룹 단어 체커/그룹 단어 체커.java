import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        sc.nextLine();
        int cnt = 0;
        
        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            boolean[] flags = new boolean[26];
            char prev = s.charAt(0);
            
            flags[prev - 'a'] = true;
            boolean isGroupWord = true;
            
            for (int j = 1; j < s.length(); j++) {
                char current = s.charAt(j);
                
                if (current != prev) {
                    if(flags[current - 'a']) {
                        isGroupWord = false;
                        break;
                    }
                    
                    flags[current - 'a'] = true;
                }
                
                prev = current;
            }
            
            if (isGroupWord) {
                cnt++;
            }
        }
        
        System.out.println(cnt);
    }
}