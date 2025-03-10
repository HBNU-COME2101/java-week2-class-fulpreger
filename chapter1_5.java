import java.util.Scanner;

public class chapter1_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("나이를 입력하세요 >> ");
        int age = scanner.nextInt();

        if (age <= 0) {
            System.out.println("나이는 양수로만 입력하세요.");
            scanner.close();
            return;
        }

        int r= age / 10;
        int b = (age % 10) / 5;
        int y = age % 5;
        int total = r + b + y;

        System.out.println("빨간 초 " + r + "개, 파란 초 " + b + "개, 노란 초 " + y + "개. 총 " + total + "개가 필요합니다.");       
        scanner.close();
    }
}
