package Lab10;

import java.io.*;
import java.util.*;
import java.util.List;

public class FileService {

    private static final String path = "C:\\Users\\User\\Desktop\\";
    private static final String format = ".txt";

    // 1
    public static void createTextFile(String fileName, String text) {

        try {
            FileWriter writer = new FileWriter(path + fileName + format);
            writer.write(text);
            writer.close();
            System.out.println("Файл создан");
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            System.err.println(e.getMessage());
        }
    }

    public static List<String> readListOfFileLines(String fileName) {
        File file = new File(path + fileName + format);
        List<String> lists = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;
            while ((input = reader.readLine()) != null) {
                lists.add(input);
            }
            return lists;
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    // 2
    public static void createTextFile(String fileName) {
        try {
            File file = new File(path + fileName + format);
            if (file.createNewFile()) {
                System.out.println("Файл создан");
            } else {
                System.out.println("Файл уже существует");
            }
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла");
            System.err.println(e.getMessage());
        }
    }

    public static void writeToFile(String fileName, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path + fileName + format))) {
            writer.write(text);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void readingTextFile(String fileName) {
        File file = new File(path + fileName + format);

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String input;

            while ((input = reader.readLine()) != null) {
                System.out.println(input);
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    // 3
    public static void mergingTextFile(String fileName, String readFileName) {
        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(path + readFileName + format);
            os = new FileOutputStream(path + fileName + format, true);

            while (is.available() > 0) {
                os.write(is.read());
            }

        } catch (IOException e) {
            System.err.println(e.getMessage());
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
                if (os != null) {
                    os.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    // 4
    public static void replacingCharactersInTextFile(String fileName) {

        String str = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(path + fileName + format))) {
            String input;
            while ((input = reader.readLine()) != null) {
                str = str + input + "\n";
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }

        String result = str.replaceAll("[^\\p{IsAlphabetic}\\p{IsDigit}\\n]", "\\$");

        createTextFile(fileName, result);
    }

    // удаление файла
    public static void deleteTextFile(String fileName) {
        File file = new File(path + fileName + format);
        file.delete();
    }


    //InputStream поток ввода(считывает байты)
    //OutputStream поток вывода(записывает байты)
    //Reader поток ввода (считывает символы)
    //Writer поток вывода (записывает символы)

    //FileInputStream считывание данных из файла
    //FileOutputStream записывает данные в файл
    //FileNotFoundException Исключение, если файл не может быть открыт

    /*
    класс File
    Файл:
    File name = new File("C://Users//file.txt");
    Папка:
    File name = new File("C://Users//directory");

    Проверка:
    exists() файл или папка реальны?
    isFile() это файл?
    isDirectory() это папка?
    */

    /*
    Чтение и запись файла
    FileInputStream(FileOutputStream) поток считывает и записывает значения по байту
    ByteArrayInputStream(ByteArrayOutputStream) считывает и записывает массивы байт
    BufferedInputStream(BufferedOutputStream) добавляет буфер в память, повышение производительности при чтении/записи.
    DataInputStream(DataOutputStream) читает и записывает данные примитивных типов (шифрование)
    */

    /*
    Закрытие потоков
    close() метод, для закрытия

    Пример конструкции try-with-resource
     позволяет не вызывать close вручную (c Java 7):
    try (FileInputStream name = new FileInputStream(file)) {
    } catch (IOException io) {
        System.out.println(io.getMessage());
    }

    Пример (ранняя Java):
    FileInputStream name = null;
    try {
        name = new FileInputStream(file);
    } catch (
            IOException ioException) {
        System.out.println(ioException.getMassage());
    } finally {
        try {
            if (name != null) {
                name.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    */

    /*
    FileReader чтение текстовых файлов
    FileWriter запись текстовых файлов
    append праметр в кострукторе. данные записываются в конец файла(true)
            перезапись данных в файле (false дефолтное значение)
     */
}
