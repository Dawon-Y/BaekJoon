import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        long len = input.length();
        long n = Long.parseLong(input);

        long answer = 0;

        for(long i = n - 9*len; i <= n; i++){
            if(solve(i) == n){
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }

    private static long solve(long n){
        long sum = n;

        while(n != 0){
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

}