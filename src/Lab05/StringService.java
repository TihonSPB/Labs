package Lab05;

public class StringService {

    // 1
    public static String longestWord(String str) {
        String word = "";
        str = str.replaceAll("\\pP", "");
        String[] str1 = str.split(" ");
        for (String i : str1) {
            if (i.length() >= word.length()) {
                word = i;
            }
        }
        return word;
    }

    // 2
    public static boolean palindrome(String str) {
        str = str.replaceAll("(?U)[\\pP\\s]", "");
        str = str.toUpperCase();

        StringBuilder str1 = new StringBuilder(str);
        str1 = str1.reverse();

        if (str.equals(str1.toString())) {
            return true;
        }
        return false;
    }

    // 3
    public static String noByaka(String str) {
        str = str.replaceAll("Бяка", "[вырезано цензурой]");
        return str;
    }

    // 4
    public static Integer numberOfSubstrings(String str, String strSearch) {

        return (str.length() - str.replace(strSearch, "").length())/strSearch.length();
    }

    // 5
    public static String wordSpread(String str) {
        String[] str1 = str.split(" ");
        str = "";
        int i = 0;
        while (i < str1.length) {
            StringBuilder s = new StringBuilder(str1[i]);
            str += s.reverse() + " ";
            i++;
        }
        return str;
    }
}
