import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = 1;

        while (true) {
            String string = br.readLine();
            if (string.contains("-")) break;

            int count = 0;
            int input = 0;

            for (char ch : string.toCharArray()) {
                if (ch == '{') {
                    input++;
                } else {
                    if (input > 0) {
                        input--;
                    } else {
                        count++;
                        input++;
                    }
                }
            }

            count += input / 2;
            sb.append(num).append(". ").append(count).append("\n");
            num++;
        }
        System.out.print(sb.toString());
    }
}
