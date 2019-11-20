package tencent2018.greedyQ;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int high = M;
        int low = 1;
        int middle;
        while (low != high) {
            middle = (low + high + 1) / 2;
            int sum = 0;
            int current = middle;
            for (int i = 0; i < N - 1 ; i++) {
                sum += current;
                current = (current + 1) / 2;
            }
            if (sum > M) {
                high = middle - 1;
            } else if (sum < M) {
                low = middle;
            } else if (sum == M) {
                System.out.println(middle);
                break;
            }
        }
    }
}