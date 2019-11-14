package tencent2018.cardGame;
import java.util.Scanner;
import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        long[] array = new long[n];
        for(int i = 0 ; i < n ;i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        long sum1 = 0;
        long sum2 = 0;
        int flag = 0;
        for(int i = n - 1 ; i >= 0 ; i--){
            if(flag % 2 == 0){
                sum1 += array[i];
                flag++;
            }else{
                sum2 += array[i];
                flag++;
            }
        }
        System.out.println( sum1 - sum2);
    }
}
/*
*tag:数组
*时间复杂度:O(nlog(n)),这里主要是排序算法Arrays.sort()花费O(nlog(n))的时间
*空间复杂度:O(n).
*/