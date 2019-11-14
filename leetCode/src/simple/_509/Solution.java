package simple._509;

public class Solution {
    public int fib(int N) {
        if(N<=1) return N;
        int a=0;
        int b=1;
        for(int i=1;i<N;i++){
            if(i%2==1)
                a=a+b;
            else
                b=a+b;
        }
        if(N%2==0)
            return a;
        else
            return b;
    }
}
