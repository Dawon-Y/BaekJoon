import javax.swing.*;
import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        String str = br.readLine();
        Stack<Character> stack = new Stack<>();

        int count = 0;
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && count < k && stack.peek() < str.charAt(i)){
                stack.pop();
                count++;
            }
            if(stack.size() < n - k){
                stack.add(str.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < stack.size(); i++){
            sb.append(stack.get(i));
        }

        bw.write(sb + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}