import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int min = n;
        int sum = 0;

        for(int i = m; i <= n; i++) {
            boolean isPrime = true;
            if(i == 1) isPrime = false;

            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime) {
                if(min > i) min = i;
                sum += i;
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        }else {
            System.out.println(sum + "\n" + min);
        }
    }
}