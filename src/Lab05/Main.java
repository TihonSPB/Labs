package Lab05;

public class Main {
    public static void main(String[] args) {

        // 1
        String str1 = "Сортировка слиянием (англ. merge sort) — алгоритм сортировки, который упорядочивает списки (или другие структуры данных, доступ к элементам которых можно получать только последовательно, например — потоки) в определённом порядке. Эта сортировка — хороший пример использования принципа «разделяй и властвуй». Сначала задача разбивается на несколько подзадач меньшего размера. Затем эти задачи решаются с помощью рекурсивного вызова или непосредственно, если их размер достаточно мал. Наконец, их решения комбинируются, и получается решение исходной задачи.";
        System.out.println(StringService.longestWord(str1));

        // 2
        System.out.println(StringService.palindrome("А лес у села."));

        // 3
        String str3 = "Встретились Бяка и Бука.\n" +
                "Никто не издал ни звука.\n" +
                "Никто не подал и знака —\n" +
                "Молчали Бука и Бяка.\n" +
                "И Бука\n" +
                "Думал со скукой:\n" +
                "«Чего он так смотрит — букой?»\n" +
                "А Бяка думал:\n" +
                "«Однако\n" +
                "Какой он ужасный\n" +
                "Бяка…»";
        System.out.println(StringService.noByaka(str3, "Бяка", "[вырезано цензурой]"));

        // 4
        System.out.println(StringService.numberOfSubstrings(str3, "Бука"));

        // 5
        String str5 = "Sample Output: The given string is: This is a test string The string reversed word by word is: sihT si a tset gnirts";
        System.out.println(StringService.wordSpread(str5));
    }
}
