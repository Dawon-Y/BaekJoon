import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()) -1;
        int dasom = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>((o1, o2) -> o2 - o1);

        for(int i = 0 ; i < N ; i++) {
            queue.add(Integer.parseInt(br.readLine()));
        }

        int vote = 0;
        while(!queue.isEmpty() && queue.peek() >= dasom) {
            queue.add(queue.poll() - 1);
            dasom++;
            vote++;
        }
        System.out.println(vote);
    }
}