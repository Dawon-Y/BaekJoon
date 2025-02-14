import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(st.nextToken());
            if (k < 2) continue;

            boolean isPrime = true;
            for (int j = 2; j * j <= k; j++) {
                if (k % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) cnt++;
        }
        System.out.println(cnt);
    }
}
