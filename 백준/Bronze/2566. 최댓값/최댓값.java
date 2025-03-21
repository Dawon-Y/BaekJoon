import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int row = 1;
        int column = 1;

        for(int i = 1; i <= 9; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            for(int j = 1; j <= 9; j++){
                int num = Integer.parseInt(stringTokenizer.nextToken());
                if (num > max){
                    max = num;
                    row = i;
                    column = j;
                }
            }
        }
        System.out.println(max);
        System.out.println(row + " " + column);
    }
}
