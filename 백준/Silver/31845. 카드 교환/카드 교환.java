import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        int ans = 0;
        int score = 0;
        
        for (int i = N - 1; i >= score; i--) {
            if (arr[i] > 0) {
                ans += arr[i];
                score += 1;
            }
            if (i == N - M) break;
        }
        
        System.out.println(ans);
    }
}