package GFG.Daily_Problems;
import java.util.*;
public class Winner_Of_An_Election {
    /*
    Given an array of n names arr of candidates in an election, where each name is
    a string of lowercase characters. A candidate name in the array represents a vote
    casted to the candidate. Print the name of the candidate that received the
    maximum count of votes. If there is a draw between two candidates, then print
    lexicographically smaller name.
     */

    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String,Integer> hp = new HashMap<>();

        for(int i=0; i<n; i++){
            hp.put(arr[i],hp.getOrDefault(arr[i],0)+1);
        }
        int votes = 0;
        String ans = "";

        for(var a : hp.keySet()){
            if(hp.get(a)>votes){
                votes = hp.get(a);
                ans = a;
            }else if(hp.get(a)==votes){
                if(a.compareTo(ans)<0){
                    ans = a;
                }
            }
        }
        return new String[]{ans,String.valueOf(votes)};
    }

    public static void main(String[] args) {
        String arr[] = {"john","johnny","jackie","johnny","john"
                ,"jackie","jamie","jamie","john","johnny","jamie",
                "johnny","john"};
        String ans[] = winner(arr,arr.length);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
