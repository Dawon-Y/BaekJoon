import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        new Main().solution();
    }

    private void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        long[] array = new long[count];
        long sum = 0;

        for (int i = 0; i < count; i++) {
            array[i] = Integer.parseInt(input[i]);
            sum += array[i];
        }

        sum /= count;
        long result = 0;

        for (int i = 0; i < count - 1; i++) { 
            long number = sum - array[i];

            array[i] += number;
            array[i + 1] -= number;
            result += Math.abs(number);
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
