package com.tomko;

import java.util.Scanner;

public class Vyacheslav {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String name = "Вячеслав";
    private static final String condition = "Задача №2\n" +"Если введенное имя совпадает с Вячеслав, " +
            "то вывести \"Привет, Вячеслав\", если нет, то вывести \"Нет такого имени\"";
    public static void checkName(String transmittedName) {
        System.out.println(condition);
        String enteredName;
        if (transmittedName.equals("")) {
            System.out.println("Введите имя: ");
            enteredName = scanner.nextLine();
        } else {
            enteredName = transmittedName;
        }
        if (enteredName.equals(name))
            System.out.println("Привет, " + enteredName + "\n");
        else {
            System.out.println("Нет такого имени.\n");
        }
    }
}
