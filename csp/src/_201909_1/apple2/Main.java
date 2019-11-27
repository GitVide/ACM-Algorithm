package _201909_1.apple2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[][] array = new int[N][];
        for (int i = 0; i < N; i++) {
            int m = scanner.nextInt();
            array[i] = new int[m];
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        boolean[] tag = new boolean[N];
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            int init = array[i][0];
            int temp = init;
            for (int j = 1; j < array[i].length; j++) {
                if (array[i][j] <= 0) {
                    temp += array[i][j];
                } else {
                    if (array[i][j] < temp) {
                        tag[i] = true;
                    }
                    temp = array[i][j];
                }
            }
            num[i] = temp;
        }
        int T = 0, D = 0, E = 0;
        for (int i = 0; i < N; i++) {
            T += num[i];
            if (tag[i]) {
                D++;
            }
            int pred = i % N;
            int Ai = (i + 1) % N;
            int succ = (i + 2) % N;
            if (tag[pred] && tag[Ai] && tag[succ]) {
                E++;
            }
        }
        System.out.println(T + " " + D + " " + E);

/*
        for(int i = 0 ; i < N ;i++){
            for (int e:array[i]) {
                System.out.print(e+" ");
            }
            System.out.println();
        }*/
    }
}
