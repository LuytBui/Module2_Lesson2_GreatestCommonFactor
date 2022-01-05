import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số thứ nhất: ");
        int a = sc.nextInt();
        a = Math.abs(a);
        System.out.println("Nhập vào số thứ hai: ");
        int b = sc.nextInt();
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("Không có ước số chung");
        } else {

            while (a != b) {
                if (a > b) {
                    a = a - b;
                } else {
                    b = b - a;
                }
            }
            System.out.printf("Ước chung lớn nhất là: %d\n", a);
        }

    }
}
