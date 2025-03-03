import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Math.abs(scanner.nextInt());    //약먹는 날짜
        int K = Math.abs(scanner.nextInt());    //약먹는 텀
        int breakfast1 = Math.abs(scanner.nextInt());//아침 시작
        int breakfast2 = Math.abs(scanner.nextInt());//아침 끝
        int lunch1 = Math.abs(scanner.nextInt());//점심 시작
        int lunch2 = Math.abs(scanner.nextInt());//점심 끝
        int dinner1 = Math.abs(scanner.nextInt());//저녁 시작
        int dinner2 =Math.abs(scanner.nextInt());//저녁 끝

        int temp = 0;
        boolean firstdaymeal=true;
        for (int i = 0; i <N; i++) {
            if(firstdaymeal){              //처음 시작시에만 실행됨
                temp=breakfast2;
                firstdaymeal=false;
            }
            else if(temp+K>=breakfast1){
                temp=Math.min(temp+K,breakfast2);
            }
            else{
                System.out.println("NO");
                System.exit(0);
            }

            if(temp+K>=lunch1){
                temp=Math.min(temp+K,lunch2);
            }
            else{
                System.out.println("NO");
                System.exit(0);
            }

            if(temp+K>=dinner1){
                temp=Math.min(temp+K,dinner2);
            }
            else{
                System.out.println("NO");
                System.exit(0);
            }

            temp-=1440;
        }
        System.out.println("YES");
    }
}