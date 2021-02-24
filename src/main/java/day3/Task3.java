package day3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number, diliver;

        for (int count = 0 ; count < 5 ; count++ ){
            number = scanner.nextDouble();
            diliver = scanner.nextDouble();
            if (diliver == 0) {
                System.out.println("Деление на 0");
                continue;
            }
            System.out.println(number/diliver);
        }

    }
}
