package simple._112;



public class Test {
    public static void  main(String[] args){
        int[] arr1={2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2={2,1,4,3,9,6};
        Solution soluton=new Solution();
        int[] ans=soluton.relativeSortArray(arr1,arr2);
        System.out.print("[");
        for(int i=0;i<ans.length-1;i++){
            System.out.print(ans[i]+",");
        }
        System.out.println(ans[ans.length-1]+"]");
    }
}
