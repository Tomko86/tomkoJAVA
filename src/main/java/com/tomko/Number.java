package com.tomko;

import java.util.Scanner;

public class Number {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String condition = "Задача №1\n" + "Если введенное число больше 7, то вывести \"Привет\"";

    public static void checkNumber(String transmittedValue) {
        System.out.println(condition);
        int input;
        try {
            if (transmittedValue.equals("")) {
                System.out.println("Введите любое число: ");
                input = Integer.parseInt(scanner.nextLine());
            } else {
                input = Integer.parseInt(transmittedValue);
            }
            if (input > 7) {
                System.out.println("Для вывода результата в файл нажмите клавишу -f-");
                if (scanner.nextLine().equals("f")) {

                }
                System.out.println("Привет\n");
            }
        } catch (NumberFormatException e) {
            System.out.println("Вы ввели не число!");
        }
    }
}
