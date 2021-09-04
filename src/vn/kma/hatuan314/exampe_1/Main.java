package vn.kma.hatuan314.exampe_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        Câu lệnh xuất ra màn hình
         */
        System.out.print("Xin chào thế giới");
        System.out.println("Hello world");
        System.out.printf("Hello world %d\n", 2021);
        System.out.println("Hello world " + 2021);
        /*
        Câu lệnh nhập vào từ bàn phím
         */
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.print("Xin chào thế giới: ");
        year = sc.nextInt();
        System.out.printf("Xin chào thế giới %d", year);
    }
}
