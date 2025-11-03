import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int J = Integer.parseInt(br.readLine());

        int left = 1;
        int right = M;

        int totalDistance = 0;

        for (int i = 0; i < J; i++) {
            int apple = Integer.parseInt(br.readLine());

            if (apple >= left && apple <= right) {
                continue;
            }

            if (apple < left) {
                int distance = left - apple;
                totalDistance += distance;
                left = apple;
                right = apple + M - 1;
            }
            else if (apple > right) {
                int distance = apple - right;
                totalDistance += distance;
                right = apple;
                left = apple - M + 1;
            }
        }

        bw.write(totalDistance + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}