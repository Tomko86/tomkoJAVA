package com.tomko;

import java.util.Scanner;

public class Application {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        start(args);
    }

    private static void start(String[] args) {
        System.out.println("Добро пожаловать в приложение: \"tomkoJava11\"");
        while (true) {
            if (args != null && args.length >= 3) {
                Number.checkNumber(args[0]);
                Vyacheslav.checkName(args[1]);
                Array.checkArray(args[2]);
                args = null;
            } else {
                System.out.println("Выберите одну из следующих задач:\n"
                        + " - нажмите <1> Задача №1\n"
                        + " - нажмите <2> Задача №2\n"
                        + " - нажмите <3> Задача №3\n"
                        + " - нажмите <4> Задача №4\n"
                        + "--------------\n"
                        + " - нажмите <0> ЗАКРЫТЬ ПРОГРАММУ \n");

                String numberTask = scanner.nextLine();
                switch (numberTask) {
                    case "1": {
                        Number.checkNumber("");
                        break;
                    }
                    case "2": {
                        Vyacheslav.checkName("");
                        break;
                    }
                    case "3": {
                        Array.checkArray("");
                        break;
                    }
                    case "4": {
                        ReadFile.bracketSequence();
                        break;
                    }
                    case "0": {
                        System.exit(0);
                    }
                    default:
                        System.out.println("Вы ввели не число! Попробуйте еще раз...\n");
                }
            }
        }
    }
}

