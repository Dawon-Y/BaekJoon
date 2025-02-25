import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] leftCount = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            leftCount[i] = Integer.parseInt(st.nextToken());
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));

        for(int height = 1; height <= N; height++){
            pq.offer(new int[]{height, leftCount[height - 1]});
        }

        int[] result = new int[N];
        Arrays.fill(result, -1);

        while (!pq.isEmpty()) {
            int[] person = pq.poll();
            int height = person[0];
            int left = person[1];
            int count = 0;
            
            for (int i = 0; i < N; i++) {
                if (result[i] == -1) { 
                    if (count == left) { 
                        result[i] = height;
                        break;
                    }
                    count++;
                }
            }
    }

    StringBuilder sb = new StringBuilder();
        for (int num : result) {
        sb.append(num).append(" ");
    }
        System.out.println(sb.toString().trim());
    }
}