import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] distance = new int[n-1];
        int[] OilPrice = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            distance[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            OilPrice[i] = Integer.parseInt(st.nextToken());
        }

        Long sum = 0L;

        int min = OilPrice[0];
        for (int i = 0; i < n - 1; i++) {
            if (OilPrice[i] < min) {
                min = OilPrice[i];
            }

            sum += ((long) distance[i] * min);
        }
        System.out.println(sum);
    }
}