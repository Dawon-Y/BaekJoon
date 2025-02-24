import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int M = Integer.parseInt(br.readLine());

        List<Integer> set = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int x = 0;
            if (!command.equals("all") && !command.equals("empty")) {
                x = Integer.parseInt(st.nextToken());
            }

            if (command.equals("add")) {
                if (!set.contains(x)) set.add(x);
            } else if (command.equals("remove")) {
                set.remove((Integer) x);
            } else if (command.equals("check")) {
                sb.append(set.contains(x) ? "1\n" : "0\n");
            } else if (command.equals("toggle")) {
                if (set.contains(x)) set.remove((Integer) x);
                else set.add(x);
            } else if (command.equals("all")) {
                set.clear();
                for (int j = 1; j <= 20; j++) set.add(j);
            } else if (command.equals("empty")) {
                set.clear();
            }
        }
        System.out.print(sb);
    }
}
