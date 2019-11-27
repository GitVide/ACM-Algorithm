package _201909_1.apple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] array = new int[N][M + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M + 1; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int[] after = new int[N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M + 1; j++) {
                after[i] += array[i][j];
            }
        }
        int T = 0;
        int k = 0, p = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            T += after[i];
            int temp = array[i][0] - after[i];
            if (temp > p) {
                p = temp;
                k = i + 1;
            }
        }
        System.out.println(T + " " + k + " " + p);
    }
}
