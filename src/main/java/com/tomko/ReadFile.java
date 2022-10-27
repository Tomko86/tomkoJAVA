package com.tomko;

import java.awt.*;
import java.io.File;

public class ReadFile {
    private static final File file = new File("src/main/resources/text.txt");

    public static void bracketSequence() {
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop не поддерживается!(");
            return;
        }
        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(file);
        } catch (Exception e) {
            System.out.println("Проблема с открытием файла! Обратитесь к разработчику!\n" + e);
        }
    }
}
