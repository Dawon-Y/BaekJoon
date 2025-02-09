import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        List<Integer> num = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                num.add(i);
            }
        }

        if (k > num.size()) {
            System.out.println(0);
        } else {
            System.out.println(num.get(k - 1));
        }
    }
}
