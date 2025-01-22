import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] croatianAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String input = br.readLine();

        for (String alphabet : croatianAlphabets) {
            input = input.replace(alphabet, "!");
        }

        System.out.println(input.length());
    }
}
