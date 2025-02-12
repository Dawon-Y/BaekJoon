import java.util.*;
import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] prices = new int[m];
        for(int i = 0; i < m; i++){
            prices[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(prices);

        int MaxProfit = 0;
        int sell = 0;

        for(int i = 0; i < m; i++){
            int price = prices[i];
            int buy = Math.min(n, m - i);
            int profit = price * buy;

            if (profit > MaxProfit) {
                MaxProfit = profit;
                sell = price;
            }
        }
        System.out.println(sell + " " + MaxProfit);
    }
}
