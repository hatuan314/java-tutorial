package vn.kma.hatuan314.exampe_2;
/*
Ôn lại kiến thức:
    - Câu lệnh điều kiện
    - Vòng lặp
    - Hàm
 */

import java.util.Scanner;

/*
Các kiểu dữ liệu: int, float, double, char, boolean, string, byte
 */
public class Example {


    private static int getChoice() {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("Chọn hàm bạn muốn thực thi");
        System.out.println("1. Câu lệnh điều kiện");
        System.out.println("2. Vòng lặp");
        System.out.println("3. Thoát");
        System.out.println("Lựa chọn của bạn là: ");
        choice = scanner.nextInt();
        return choice;
    }

    private static void showIndex(int index) {
        System.out.printf("%d\t", index);
        if (index ==9) {
            System.out.println();
        }
    }

    private static void loopFunction() {
        System.out.println("Vòng lặp for");
        for (int forIndex = 0; forIndex < 10; forIndex++) {
            showIndex(forIndex);
        }
        System.out.println("Vòng lặp while");
        int whileIndex = 0;
        while (whileIndex < 10) {
            showIndex(whileIndex);
            whileIndex++;
        }
        System.out.println("Vòng lặp do...while");
        int doWhileIndex = 0;
        do {
            showIndex(doWhileIndex);
            doWhileIndex++;
        } while (doWhileIndex < 10);
    }

    private static void conditionFunction() {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        if (a < b) {
            System.out.printf("%d < %d\n", a, b);
        } else if ( a == b) {
            System.out.printf("%d = %d\n", a, b);
        } else {
            System.out.printf("%d > %d\n", a, b);
        }
    }

    public static void main(String[] args) {
        do {
            int choice;
            choice = getChoice();
            switch (choice) {
                case 1:
                    conditionFunction();
                    break;
                case 2:
                    loopFunction();
                    break;
                case 3:
                    System.out.println("Thoát");
                    return;
            }
        } while (true);
    }
}
