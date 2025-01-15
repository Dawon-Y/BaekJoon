import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        for(char i = 'a'; i <= 'z'; i++){
            System.out.print(str.indexOf(i)+" ");
        }

        scanner.close();
    }
}
