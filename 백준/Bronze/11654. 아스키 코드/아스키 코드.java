import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ch = scanner.next().charAt(0);
        System.out.print(ch);

        scanner.close();
    }
}
