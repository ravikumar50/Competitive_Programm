package GFG.Daily_Problems;


import java.util.*;

class Meeting{
    int st;
    int end;
    int idx;

    Meeting(int st, int end, int idx){
        this.st = st;
        this.end = end;
        this.idx = idx;
    }
}

public class Maximum_Meetings_In_A_Room {
    public static ArrayList<Integer> maxMeetings(int n, int[] S, int[] F) {
        // code here

        Meeting arr[] = new Meeting[n];

        for(int i=0; i<n; i++){
            arr[i] = new Meeting(S[i],F[i],i+1);
        }

        Arrays.sort(arr,(a,b)->a.end==b.end ? a.idx-b.idx : a.end-b.end);

        Meeting prev = arr[0];
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(arr[0].idx);

        for(int i=1; i<n; i++){
            Meeting m = arr[i];

            if(m.st>prev.end){
                ans.add(m.idx);
                prev = m;
            }
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        int S[] = {1,3,0,5,8,5};
        int F[] = {2,4,6,7,9,9};

        ArrayList<Integer> ans = maxMeetings(S.length,S,F);
        System.out.println(ans);
    }
}
