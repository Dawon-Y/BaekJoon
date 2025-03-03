import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        long N = Long.parseLong(input[0]);
        long K = Long.parseLong(input[1]);

        String[] medicineInput = br.readLine().split(" ");
        long[] medicine = new long[6];
        for (int i = 0; i < 6; i++) {
            medicine[i] = Long.parseLong(medicineInput[i]);
        }

        long start = medicine[1];

        for (int day = 0; day < N; day++) {
            start += K;
            if (start < medicine[2]) {
                System.out.println("NO");
                return;
            }
            start = Math.min(start, medicine[3]);
            start += K;
            if (start < medicine[4]) {
                System.out.println("NO");
                return;
            }
            start = Math.min(start, medicine[5]);
            start += K;

            if (day < N - 1) {
                if (start < medicine[0] + 1440) {
                    System.out.println("NO");
                    return;
                }
                start = Math.min(start, medicine[1] + 1440);
                for (int i = 0; i < 6; i++) {
                    medicine[i] += 1440;
                }
            }
        }
        System.out.println("YES");
    }
}