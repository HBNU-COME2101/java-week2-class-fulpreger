import java.util.Scanner;

public class chapter1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("생일 입력 하세요 >> ");
        int b = scanner.nextInt();
        int y = b / 10000;
        int m = (b % 10000) / 100;
        int d = b % 100;
        System.out.println(y + "년 " + m + "월 " + d + "일");
        
        scanner.close();
    }
}
