import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(reader.readLine());
        
        for (int i = 0; i < T; i++) {
            String[] input = reader.readLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            writer.write((A + B) + "\n");
        }
        
        writer.flush();
        writer.close();
        reader.close();
    }
}
