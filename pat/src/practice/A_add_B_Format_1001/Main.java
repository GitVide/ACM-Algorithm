package practice.A_add_B_Format_1001;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            long a = scanner.nextInt();
            long b = scanner.nextInt();
            long c = a + b;
            String str = String.valueOf(Math.abs(c));
            StringBuilder stringBuilder = new StringBuilder(str);

            int len = stringBuilder.length();
            if (len > 3 && len <= 6) {
                stringBuilder.insert(len - 3, ',');
            } else if (len > 6) {
                stringBuilder.insert(len - 3, ',').insert(stringBuilder.length() - 7, ',');
            }
            if (c < 0)
                stringBuilder.insert(0, '-');
            System.out.println(stringBuilder);
        }

    }
}
