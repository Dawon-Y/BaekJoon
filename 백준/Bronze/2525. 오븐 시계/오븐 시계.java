import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt(); // 시
        int b = scanner.nextInt(); // 분
        int c = scanner.nextInt(); // 입력한 분

        int min = (b + c) % 60;
        int minH = (b + c) / 60;
        int hour = (a + minH) % 24;

        System.out.println(hour + " " + min);

        scanner.close();
    }
}
