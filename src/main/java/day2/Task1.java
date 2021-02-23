package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Введите число этажей");
        int numberOfFloors = scanner.nextInt();

        if ( numberOfFloors >= 9 ) {
            System.out.println("Многоэтажный дом");
        }
        else
            if ( numberOfFloors >= 5 ) {
                System.out.println("Среднеэтажный дом");
            }
            else
                if ( numberOfFloors >= 1 ) {
                System.out.println("Малоэтажный дом");
                }
                else {
                System.out.println("Ошибка ввода");
                }
    }

}
