import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) break; 

            List<Integer> num = new ArrayList<>(); 
            int sum = 0;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    num.add(i);
                    sum += i;
                }
            }

            if (sum == n) {
                sb.append(n).append(" = ");
                for (int i = 0; i < num.size(); i++) {
                    if (i > 0) sb.append(" + ");
                    sb.append(num.get(i));
                }
                sb.append("\n");
            } else {
                sb.append(n).append(" is NOT perfect.\n");
            }
        }
        System.out.print(sb);
    }
}