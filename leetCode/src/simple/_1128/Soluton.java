package simple._1128;

import java.util.HashMap;

public class Soluton {
    /*
    * 超出时间限制
    * */
/*    public int numEquivDominoPairs(int[][] dominoes) {
        int ans=0;
//        int[] tag=new int[dominoes.length];
        for(int i=0;i<dominoes.length;i++){
            for(int j=i+1;j<dominoes.length;j++){
                if(((dominoes[i][0]==dominoes[j][0])&&(dominoes[i][1]==dominoes[j][1]))||((dominoes[i][1]==dominoes[j][0])&&(dominoes[i][0]==dominoes[j][1]))){
                    ans++;
                    System.out.print("["+dominoes[i][0]+","+dominoes[i][1]+"]-["+dominoes[j][0]+","+dominoes[j][1]+"]");
                    System.out.println("("+i+","+j+")");
                }
            }
        }
        return ans;
    }*/
    public int numEquivDominoPairs(int[][] dominoes) {
        //初始化Map集合
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        //定义总数sum，并初始化为0
        int sum = 0;
        //循环遍历二维数组dominoes
        for (int i = 0; i < dominoes.length ; i++)  {
            //获取当前「数字对」的值，并将较小的值设置为a,较大的值设置为b
            Integer a = dominoes[i][0];
            Integer b = dominoes[i][1];
            if (a > b) {
                a = dominoes[i][1];
                b = dominoes[i][0];
            }
            //将a 作为Map1的key1
            //而b 作为Map1的value1 （即map2) 的key2

            //判断Map1中是否有key1 为 a 的值
            if (map.containsKey(a)) {
                HashMap<Integer, Integer> list = map.get(a);
                //判断Map2中是否有key2 为 b 的值
                if (list.containsKey(b)) {
                    //获取value2的值并加入到sum中
                    int count = list.get(b);
                    sum = sum + count;
                    //对应的value的值+1
                    list.put(b, count+1);
                    map.put(a, list);
                } else {
                    //初始化数值为1
                    list.put(b, 1);
                    map.put(a, list);
                }
            } else {
                //初始化数值为1
                HashMap<Integer, Integer> list = new HashMap<>();
                list.put(b, 1);
                map.put(a, list);
            }
        }
        return sum;
    }
}
