import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int Quarter = 25;
        int Dime = 10;
        int Nickel = 5;
        int Penny = 1;

        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            int c = Integer.parseInt(br.readLine());
            sb.append(c / Quarter + " ");
            c %= Quarter;

            sb.append(c / Dime + " ");
            c %= Dime;

            sb.append(c / Nickel + " ");
            c %= Nickel;

            sb.append(c / Penny + "\n");
        }
        System.out.print(sb);
        br.close();
    }
}