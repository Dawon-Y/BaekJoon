import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for(int i = 0; i < T; i++){
            int R = scanner.nextInt();
            String str = scanner.next();

            for(int j = 0; j < str.length(); j++){
                for(int k = 0; k < R; k++)
                    System.out.print(str.charAt(j));
            }
            System.out.println();
        }
        scanner.close();
    }
}
