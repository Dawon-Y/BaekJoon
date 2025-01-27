import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] p = new int[n];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            p[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(p);

        int totalTime = 0;
        int accumulatedTime = 0;

        for (int time : p) {
            accumulatedTime += time;
            totalTime += accumulatedTime;
        }

        System.out.println(totalTime);

    }
}
