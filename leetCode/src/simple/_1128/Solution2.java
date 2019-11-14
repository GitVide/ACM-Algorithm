package simple._1128;

public class Solution2 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[][] count=new int[10][10];
        for(int i=0;i<dominoes.length;i++){
            int a=dominoes[i][0];
            int b=dominoes[i][1];
            if(a>b){
                int tmp=a;
                a=b;
                b=tmp;
            }
            count[a][b]++;
        }
        int ans=0;
        for(int i=0;i<count.length;i++){
            for(int j=0;j<count[i].length;j++){
                if(count[i][j]!=0)
                    ans+=(count[i][j]-1)*count[i][j]/2;
            }
        }
        return ans;
    }
}
