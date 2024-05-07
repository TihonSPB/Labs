package Lab10;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1
        FileService.createTextFile("text1",
                "Lorem Ipsum - это текст-\"рыба\", часто используемый в печати \n" +
                        "и вэб-дизайне. Lorem Ipsum является стандартной \"рыбой\" для \n" +
                        "текстов на латинице с начала XVI века. В то время некий \n" +
                        "безымянный печатник создал большую коллекцию размеров и \n" +
                        "форм шрифтов, используя Lorem Ipsum для распечатки \n" +
                        "образцов. Lorem Ipsum не только успешно пережил без \n" +
                        "заметных изменений пять веков, но и перешагнул в \n" +
                        "электронный дизайн. Его популяризации в новое время \n" +
                        "послужили публикация листов Letraset с образцами Lorem \n" +
                        "Ipsum в 60-х годах и, в более недавнее время, программы \n" +
                        "электронной вёрстки типа Aldus PageMaker, в шаблонах \n" +
                        "которых используется Lorem Ipsum.\n");

        //FileService.readingTextFile("text1");

        List<String> textList = FileService.readListOfFileLines("text1");

        System.out.println(textList);

        // 2
        FileService.createTextFile("text2");

        FileService.writeToFile("text2",
                "Давно выяснено, что при оценке дизайна и композиции \n" +
                        "читаемый текст мешает сосредоточиться. Lorem Ipsum \n" +
                        "используют потому, что тот обеспечивает более или менее \n" +
                        "стандартное заполнение шаблона, а также реальное \n" +
                        "распределение букв и пробелов в абзацах, которое не \n" +
                        "получается при простой дубликации \"Здесь \n" +
                        "ваш текст.. Здесь ваш текст.. Здесь ваш текст..\" Многие программы электронной \n" +
                        "вёрстки и редакторы HTML используют Lorem Ipsum в качестве \n" +
                        "текста по умолчанию, так что поиск по ключевым словам \n" +
                        "\"lorem ipsum\" сразу показывает, как много веб-страниц всё \n" +
                        "ещё дожидаются своего настоящего рождения. За прошедшие \n" +
                        "годы текст Lorem Ipsum получил много версий. Некоторые \n" +
                        "версии появились по ошибке, некоторые - намеренно \n" +
                        "(например, юмористические варианты).\n");

        FileService.readingTextFile("text2");

        // 3
        FileService.mergingTextFile("text3", "text1");
        FileService.mergingTextFile("text3", "text2");
        //FileService.readingTextFile("text3");

        // 4
        FileService.mergingTextFile("text4", "text3");

        FileService.replacingCharactersInTextFile("text4");

        FileService.readingTextFile("text4");

        //удаление файлов
        FileService.deleteTextFile("text1");
        FileService.deleteTextFile("text2");
        FileService.deleteTextFile("text3");
        FileService.deleteTextFile("text4");
    }
}
