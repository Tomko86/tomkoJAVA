package com.tomko;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFile {

    private static final String taskFour = "Дана скобочная последовательность: [((())()(())]]\n" +
            "- Можно ли считать эту последовательность правильной?\n" +
            "- Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?\n\n" +
            "Ответ\n" +
            "- Нет.\n" +
            "- Нужно заменить вторую скобку на квадратную - [[(())()(())]]\n" +
            "- Или заменить предпоследнюю скобку на круглую - [((())()(()))]\n";

    public static void bracketSequence() {
        try {
            Files.writeString(Paths.get("bracketSequence.txt"), taskFour);
            System.out.println("Результат смотри в файле \"bracketSequence.txt\"");
        } catch (IOException e) {
            System.out.println("Не удалось создать файл!");
        }
    }
}
