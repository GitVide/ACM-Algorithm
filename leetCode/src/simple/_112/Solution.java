package simple._112;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] ansArray=new int[arr1.length];
        int index=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    ansArray[index]=arr1[j];
                    index++;
                }
            }
        }
        List<Integer> arrayList=new ArrayList<Integer>();
        for(int i=0;i<arr1.length;i++){
            Boolean tag=false;
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j])
                    tag=true;
            }
            if(!tag)
                arrayList.add(arr1[i]);
        }
        Collections.sort(arrayList);
        for (int i=0;i<arrayList.size();i++){
            ansArray[index]=arrayList.get(i);
            index++;
        }
        return ansArray;
    }
}
