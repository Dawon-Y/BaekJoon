import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int p = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] acc = new int[n]; 
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            acc[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(acc);
        int count = 0;

        while (count < n && p < 200) {
            p += acc[count];
            count++;
        }

        System.out.println(count);
        br.close();
    }
}
