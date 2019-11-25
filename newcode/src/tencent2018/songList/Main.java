package tencent2018.songList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = scanner.nextInt();
        int lenA = scanner.nextInt();
        int numA = scanner.nextInt();
        int lenB = scanner.nextInt();
        int numB = scanner.nextInt();
        long[][] arr = combination(100);
        long sum = 0;
        for (int i = 0; i <= numA; i++) {
            int nA = i;
            int tempnB = K - nA * lenA;
            if ((tempnB >= 0) && ((tempnB % lenB) == 0) && ((tempnB / lenB) <= numB)) {
                int nB = tempnB / lenB;
                long temp = ((arr[numA][nA] * arr[numB][nB]) % mod);
                sum += temp;
            }
        }
        System.out.println(sum % mod);
    }

    public static long mod = 1000000007L;

    public static long[][] combination(int m) {
        long[][] arr = new long[m + 1][m + 1];
        arr[0][0] = 1;
        for (int i = 1; i <= m; i++) {
            arr[i][0] = 1;
            for (int j = 1; j <= i; j++) {
                arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j]) % mod;
            }
        }
        return arr;
    }
}
