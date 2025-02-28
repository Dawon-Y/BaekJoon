import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String left = st.nextToken();
        String right = st.nextToken();
        int count = 0;

        if(left.length() == right.length()) {
            for(int i = 0; i < left.length(); i++) {
                if(left.charAt(i) != right.charAt(i)) {
                    break;
                }
                else {
                    if(left.charAt(i) == '8') {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
        bw.close();
    }
}