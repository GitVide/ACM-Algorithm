package tencent2018.flipArray;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long m = scanner.nextInt();
        long sum = 0;
        long flag = m;
        for(long i = 0 ; i < n ; i++){
            if(flag > 0){
                sum += -i;
                flag--;
                if(flag == 0)
                    flag = -m;
            }else if(flag < 0){
                sum += i;
                flag++;
                if(flag == 0)
                    flag = m;
            }
        }
        System.out.println(sum);
    }
}
/*
* tag：数组
* 时间复杂度：O(n)
* 空间复杂度：O(1)
* */