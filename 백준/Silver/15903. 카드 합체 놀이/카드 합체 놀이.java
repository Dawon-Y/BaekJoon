import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        PriorityQueue<Long> pq = new PriorityQueue<>();
        long total = 0;

        for (int i = 0; i < n; i++) {
            long num = Long.parseLong(st.nextToken());
            total += num;
            pq.add(num);
        }
        for (int i = 0; i < m; i++) {
            long num1 = pq.poll();
            long num2 = pq.poll();
            long sum = num1 + num2;
            total += sum;
            pq.add(sum);
            pq.add(sum);
        }
        System.out.println(total);
    }
}