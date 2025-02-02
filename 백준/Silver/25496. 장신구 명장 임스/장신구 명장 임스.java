import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int p = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < t; i++) {
            queue.add(Integer.parseInt(st.nextToken()));
        }

        int count = 0;
        while (p < 200 && !queue.isEmpty()) {
            p += queue.poll();
            count++;
        }

        System.out.println(count);
        br.close();
    }
}
