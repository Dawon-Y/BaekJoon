import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] ropes = new int[n];
        for(int i = 0; i < n; i++){
            ropes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropes);

        int MaxRopes = 0;
        int result = 0;

        for(int i = 0; i < n; i++){
            int maxWeight = ropes[i] * (n - i);
            result = Math.max(result, maxWeight);
        }
        System.out.println(result);
    }
}
