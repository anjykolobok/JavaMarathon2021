package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите 'a b'");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int counter = a ;

        if ( a <= b ) {

            while ( counter++ < b-1) {
                if (counter % 5 == 0 && counter % 10 != 0) {
                    System.out.print(counter + " ");
                }
            }
        }
        else System.out.println("Некорректный ввод");
    }
}