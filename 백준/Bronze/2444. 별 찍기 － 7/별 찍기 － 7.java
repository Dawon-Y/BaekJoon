import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i, j, k;

        for(i = 0; i < n; i++) {
            for (j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(i = 1; i < n; i++){
            for(j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(j = 2 * n - 1; j > 2 * i; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}