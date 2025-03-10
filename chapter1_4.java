import java.util.Scanner;

public class chapter1_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("여행지 >> ");
        String place = scanner.nextLine();

        System.out.print("인원수 >> ");
        int p = scanner.nextInt();

        System.out.print("숙박일 >> ");
        int d = scanner.nextInt();

        System.out.print("1인당 항공료 >> ");
        int f = scanner.nextInt();

        System.out.print("1방 숙박비 >> ");
        int r = scanner.nextInt();

        int rn = (p + 1) / 2;

        int total = (p * f) + (rn * r * d);

        System.out.println(p + "명의 " + place + " " + d + "박 " + (d + 1) + "일 여행에는 " 
                            + rn + "개 필요하며 경비는 " + total + " 원입니다.");
        
        scanner.close();
    }
}
