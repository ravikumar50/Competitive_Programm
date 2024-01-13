package CodeChef;

import java.util.*;

class Node{
    char data;
    HashMap<Character,Node> hp;

    Node(char data){
        this.data = data;
        hp = new HashMap<>();
    }
}
public class Practice {

    static void insert(Node root, String s){
        int n = s.length();
        Node curr = root;

        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(curr.hp.containsKey(ch)){
                curr = curr.hp.get(ch);
            }else{
                Node a = new Node(ch);
                curr.hp.put(ch,a);
                curr = a;
            }
        }
    }

    static int binaryToDecimal(String s){
        int n = s.length();
        int ans = 0;
        int x = 0;
        for(int i=n-1; i>=0; i--){
            int a = s.charAt(i)-48;
            ans = ans + a*(int)Math.pow(2,x);
            x++;
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,10,5,25,2,8};

        int n = arr.length;
        int ans = 0;


        Node root = new Node('.');
        for(int i=0; i<n; i++){
            int num = arr[i];
            StringBuilder s = new StringBuilder();
            while(num!=0){
                int x = num%2;
                s.insert(0,String.valueOf(x));
                num=num/2;
            }
            int k = s.length();
            if(k!=32){
                s.insert(0,"0".repeat(32-k));
            }
            if(i==0){
                insert(root,s.toString());
            }else {
                String sum = "";
                Node curr = root;
                for (int j = 0; j < s.length(); j++) {
                    char ch = s.charAt(j);
                    if (ch == '1') {
                        if (curr.hp.containsKey('0')) {
                            sum += "1";
                            curr = curr.hp.get('0');
                        } else {
                            sum += "0";
                            curr = curr.hp.get('1');
                        }
                    } else {
                        if (curr.hp.containsKey('1')) {
                            sum += "1";
                            curr = curr.hp.get('1');
                        } else {
                            sum += "0";
                            curr = curr.hp.get('0');
                        }
                    }
                }
                ans = Math.max(ans, binaryToDecimal(sum));
                insert(root, s.toString());
            }

        }
        System.out.println(ans);
    }
}
