import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        x = (x % 10) * 100 + ((x % 100) / 10 ) * 10 + (x / 100);
        y = (y % 10) * 100 + ((y % 100) / 10 ) * 10 + (y / 100);

        System.out.print(x > y ? x : y);

        scanner.close();
    }
}
