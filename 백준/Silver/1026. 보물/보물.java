import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        Integer[] b = new Integer[n];

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(input[i]);
        }

        input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            b[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(a);
        Arrays.sort(b, Comparator.reverseOrder());

        int answer = 0;
        for(int i = 0; i < n; i++){
            answer += a[i] * b[i];
        }
        bw.write(String.valueOf(answer));
        bw.flush();
    }
}
