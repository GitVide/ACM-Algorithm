package tencent2018.greedyQ;

import java.util.Scanner;
public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        if(N == 0 || M == 0){
            System.out.println(0);
            return;
        }
        for(int i = M ; i > 0 ; i--){
            if(isOk(i,N,M)){
                System.out.println(i);
                break;
            }
        }

    }
    public static boolean isOk(int first,int N,int M){
        int sum = first;
        int previous = first;
        for(int i = 1 ; i < N ; i++){
            int current;
            if(previous % 2 == 0){
                current = previous/2;
            }else{
                current = previous/2 + 1;
            }
            previous = current;
            sum += current;
            if(sum > M){
                return false;
            }
        }
        return true;
    }
}
