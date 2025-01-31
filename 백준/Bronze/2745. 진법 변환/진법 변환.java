import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String str = st.nextToken();

        int exp = Integer.parseInt(st.nextToken());
        int sum = 0;
        int length = str.length()-1;
        int result = 0;

        for(int i=0; i<str.length();i++){
            char c = str.charAt(length-i);
            if(c>='A'&&c<='Z'){
                result = c-55;
                sum = sum+(int)Math.pow(exp, i)*result;
            }else {
                result = c-'0';
                sum = sum+(int)Math.pow(exp, i)*result;
            }
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}