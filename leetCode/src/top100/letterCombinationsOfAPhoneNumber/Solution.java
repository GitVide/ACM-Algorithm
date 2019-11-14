package top100.letterCombinationsOfAPhoneNumber;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    String[] letterMap = new String[10];

    List<String> anwser = new ArrayList<String>();
    public List<String> letterCombinations(String digits) {
        letterMap[2] = "abc";
        letterMap[3] = "def";
        letterMap[4] = "ghi";
        letterMap[5] = "jkl";
        letterMap[6] = "mno";
        letterMap[7] = "pqrs";
        letterMap[8] = "tuv";
        letterMap[9] = "wxyz";
        backTrack("",0,digits);
        return anwser;
    }

    public void backTrack(String combine,int index,String digits){
        if(index == digits.length()){
            anwser.add(combine);
            return;
        }
        char c = digits.charAt(index);

        String letters = letterMap[c - '0'];
        for(int i = 0 ; i < letters.length() ; i++){
            backTrack(combine + letters.charAt(i) , index + 1 , digits);
        }
    }
}