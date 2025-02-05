import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
 
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
 
        String input = br.readLine();
 
        char[] arr = input.toCharArray();
        Deque<Character> dq = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++) {
            // 데크의 맨 뒤의 값이 arr[i]보다 작으면 삭제한다.
            // 아래 조건을 만족할 때까지 반복.
            while (K > 0 && !dq.isEmpty() && dq.getLast() < arr[i]) {
                dq.removeLast();
                K--;
            }
            dq.addLast(arr[i]);
        }
 
        StringBuilder ans = new StringBuilder();
        while (dq.size() > K) {
            ans.append(dq.removeFirst());
        }
        bw.write(ans.toString() + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
