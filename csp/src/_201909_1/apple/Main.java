package _201909_1.apple;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    static class Pair {
        int w;
        int index;
        int d;

        public Pair(int w, int index) {
            this.w = w;
            this.index = index;
            d = 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int K = scanner.nextInt();
        int[] E = new int[10];
        for (int i = 0; i < 10; i++) {
            E[i] = scanner.nextInt();
        }
        Pair[] wArray = new Pair[n];
        for (int i = 0; i < n; i++) {
            int wi = scanner.nextInt();
            wArray[i] = new Pair(wi, i + 1);
        }
        Comparator<Pair> cmp = new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                if (o1.w > o2.w) {
                    return -1;
                } else if (o1.w == o2.w) {
                    if (o1.index < o2.index)
                        return -1;
                } else{
                    return 1;
                }
                return 0;
            }
        };
        Arrays.sort(wArray, cmp);

        for (int i = 0; i < n; i++) {
            wArray[i].d = i + 1;
            int temp = (wArray[i].d - 1) % 10 + 1;
            wArray[i].w += E[temp - 1];
        }
        Arrays.sort(wArray, cmp);
        for (int i = 0; i < K - 1; i++) {
            System.out.print(wArray[i].index + " ");
        }
        System.out.print(wArray[K - 1].index);
    }
}
