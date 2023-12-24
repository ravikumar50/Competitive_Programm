package Atcoder;


import java.util.*;
public class Longest_Path {

    static ArrayList<Integer> graph[];

    static void addEdge(int a, int b){
        graph[a].add(b);
    }

//    static void display(){
//        for(int i=0; i<graph.length; i++){
//            System.out.print(i+" -> ");
//            System.out.println(graph[i]);
//        }
//    }

    static int ans;
    static int longestPath(int src){
        if(graph[src].size()==0){
            return 0;
        }

        int max = 0;

        for(var a : graph[src]){
            max = Math.max(max,longestPath(a));
        }
        ans = Math.max(ans,max);
        return 1+max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList[n];
        for(int i=0; i<n; i++){
            graph[i] = new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            addEdge(a-1,b-1);
        }

        int indegree[] = new int[n];
        for(int i=0; i<n; i++){
            for(var a : graph[i]) indegree[a]++;
        }
        ans = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(indegree[i]==0){
                longestPath(i);
            }
        }
        System.out.println(ans+1);
    }
}
