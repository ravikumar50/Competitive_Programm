package Codeforces.Contest.Codeforces_Round_918;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Bicycle_G {

    // not solved


    static void addEdge(ArrayList<int[]> graph[], int a, int b, int wt){
        graph[a].add(new int[]{b,wt});
        graph[b].add(new int[]{a,wt});
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t>0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            ArrayList<int[]> graph[] = new ArrayList[n];
            for(int i=0; i<n; i++) graph[i] = new ArrayList<>();

            for(int i=0; i<m; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                int wt = sc.nextInt();
                addEdge(graph,a-1,b-1,wt);
            }
            int slow[] = new int[n];
            for(int i=0; i<n; i++){
                slow[i] = sc.nextInt();
            }

            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->a[1]-b[1]);
            int ans[] = new int[n];
            int visited[] = new int[n];
            Arrays.fill(ans,Integer.MAX_VALUE);
            Arrays.fill(visited,-1);
            ans[0] = 0;
            visited[0] = 1;
            pq.add(new int[]{0,0});
            int prev = slow[0];

            while(pq.size()!=0){
                int a[] = pq.remove();
                visited[a[0]] = 1;
                if(prev>slow[a[0]]) prev = slow[a[0]];

                for(var x : graph[a[0]]){

                    if(visited[x[0]]!=1 && ans[x[0]]>ans[a[0]]+x[1]*prev){
                        ans[x[0]]=ans[a[0]]+x[1]*prev;
                        pq.add(new int[]{x[0],ans[x[0]]});

                    }


                }
            }
            // display(graph);
            System.out.println(ans[n-1]);
            t--;
        }
    }
}
