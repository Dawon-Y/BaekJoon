import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();
            if (isGroupString(word)) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean isGroupString(String str) {
        boolean[] letter = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);
            char prev = (i > 0) ? str.charAt(i - 1) : 0;
            if (!letter[now - 'a']) {
                letter[now - 'a'] = true;
            } else if (now != prev) {
                return false;
            }
        }
        return true;
    }
}