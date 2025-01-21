import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        int len = str.length();
        int res = 1;

        for(int i = 0; i < len/2; i++){
            if(str.charAt(i) != str.charAt(len - 1 - i))
                res = 0;
        }
        System.out.println(res);

        scanner.close();
    }
}
