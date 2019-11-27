package tencent50.reverse_words_557;

public class Main {
    public static void main(String[] args) {

        System.out.println(reverseWords("Let's take LeetCode contest"));
    }

    public static String reverseWords(String s) {
        String[] strArray = s.split(" ");
        StringBuilder strBuil = new StringBuilder();
        for (String str : strArray) {
            StringBuilder strTemp = new StringBuilder(str);
            strBuil.append(strTemp.reverse() + " ");
        }
        return new String(strBuil.substring(0, strBuil.length() - 1));
    }
}
