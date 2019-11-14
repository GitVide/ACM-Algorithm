package simple._1128;

import java.util.HashMap;

public class Solution1 {
    /*
    * 二重map，可以AC
    * */
    public int numEquivDominoPairs(int[][] dominoes) {
        int ans=0;
        HashMap<Integer,HashMap<Integer,Integer>> hashMap=new HashMap<>();
        for(int i=0;i<dominoes.length;i++){
            Integer a=dominoes[i][0];
            Integer b=dominoes[i][1];
            if(a>b){
                int tmp=a;
                a=b;
                b=tmp;
            }
            if(!hashMap.containsKey(a)){
                HashMap<Integer,Integer> map2=new HashMap<>();
                map2.put(b,1);
                hashMap.put(a,map2);
            }else {
                HashMap<Integer,Integer> map2=hashMap.get(a);
                if(map2.containsKey(b)){
                    int count=map2.get(b);
                    ans+=count;
                    map2.put(b,count+1);
                    hashMap.put(a,map2);
                }else {
                    map2.put(b,1);
                    hashMap.put(a,map2);
                }
            }
        }
        return ans;
    }
}
