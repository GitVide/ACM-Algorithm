package simple._1137;

class Solution {
    int[] array=new int[40];
    public static void main(String[] args){
        Solution solution=new Solution();
        System.out.println(solution.tribonacci(37));
    }
    public int tribonacci(int n) {
        if(n<=1){
            array[n]=n;
            return n;
        }else if(n==2){
            array[n]=1;
            return 1;
        }else{
            if(array[n]!=0&&array[n]!=1){
                return array[n];
            }else{
                array[n]=tribonacci(n-1)+tribonacci(n-3)+tribonacci(n-2);
                return tribonacci(n-1)+tribonacci(n-3)+tribonacci(n-2);
            }
        }
    }
}
