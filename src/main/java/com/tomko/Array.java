package com.tomko;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class Array {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String condition = "Задача №3\n" + "На входе есть числовой массив, " +
            "необходимо вывести элементы массива кратные 3.";

    public static void checkArray(String transmittedValue) {
        System.out.println(condition);
        int[] array;
        if (transmittedValue.equals("")) {
            System.out.println("Введите пять элементов числового массива: ");
            array = new int[5];
            for (int i = 0; i < array.length; i++) {
                try {
                    array[i] = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не число! Попробуйте еще раз: ");
                    i--;
                }
            }
        } else {
            String[] arraySymbols = transmittedValue.split(",");
            array = new int[arraySymbols.length];
            for (int i = 0; i < array.length; i++) {
                try {
                    array[i] = Integer.parseInt(arraySymbols[i]);
                } catch (NumberFormatException e) {
                    System.out.println("Вы ввели не число!");
                    return;
                }
            }
        }

        StringBuilder sb = new StringBuilder("[ ");
        for (int number : array) {
            if (number % 3 == 0)
                sb.append(number).append(" ");
        }
        String result = sb.append("]").toString();

        System.out.println("Для вывода результата в файл нажмите клавишу -f-");
        if (scanner.nextLine().equals("f")) {
            try {
                Files.writeString(Paths.get("array.txt"), result);
                System.out.println("Результат смотри в файле \"array.txt\"");
            } catch (IOException e) {
                System.out.println("Не удалось создать файл!");
            }
        } else
            System.out.print("Элементы массива кратные трем: " + result);
        System.out.println("\n");
    }
}
