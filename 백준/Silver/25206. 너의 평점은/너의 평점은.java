import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int major = 20;
        float grade = 0;
        float score = 0;

        for (int i = 0; i < major; i++) {
            st = new StringTokenizer(br.readLine());
            st.nextToken();
            float gr = Float.parseFloat(st.nextToken());
            String sc = st.nextToken();

            if (sc.equals("P")) {
                continue;
            }
            grade += gr;
            score += conversion(sc) * gr;
        }

        System.out.printf("%.6f", score / grade);
    }

    private static float conversion(String str) {
        switch (str) {
            case "A+":
                return 4.5f;
            case "A0":
                return 4.0f;
            case "B+":
                return 3.5f;
            case "B0":
                return 3.0f;
            case "C+":
                return 2.5f;
            case "C0":
                return 2.0f;
            case "D+":
                return 1.5f;
            case "D0":
                return 1.0f;
            case "F":
                return 0;
            default:
                return 0;
        }
    }
}
