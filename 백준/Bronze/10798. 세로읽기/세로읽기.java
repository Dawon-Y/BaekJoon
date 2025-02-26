import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char arr[][] = new char[5][15];

        for(int i = 0; i < 5; i++){
            String str = br.readLine();
            for(int j = 0; j < str.length(); j++)
                arr[i][j] = str.charAt(j);
        }

        for(int j = 0; j < arr[0].length; j++){
            for(int i = 0; i < 5; i++) {
                if (arr[i][j] == 0)
                    continue;
                bw.write(String.valueOf(arr[i][j]));
            }
        }
        bw.flush();
        bw.close();
    }
}
