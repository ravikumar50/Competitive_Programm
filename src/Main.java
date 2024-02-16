import java.util.*;

import java.util.Random;

// Main class to demonstrate Stop-and-Wait protocol
public class Main {
    static ArrayList<String> arr = new ArrayList<>();
    static boolean reciever(String s){
        int a = (int)(Math.random()*2);
        if(a==1){
            arr.add(s);
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of data to be sent");
        int n = sc.nextInt();

        int idx = 0;

        while(idx<n){
            System.out.println("Enter Frame "+(idx+1));
            String s = sc.next();
            System.out.println("Sending Frame "+(idx+1));
            boolean flag = reciever(s);
            if(flag==true){
                System.out.println("Recieved the acknowledgement for Frame "+(idx+1));
                System.out.println("Frame "+(idx+1)+" sent Successfully");
                System.out.println();
                idx++;
            }else{
                System.out.println("Did not recieved the acknowledgement of Frame "+(idx+1));
                System.out.println("Resending the Frame "+(idx+1));
                System.out.println();
                flag = reciever(s);
                while (flag!=true){
                    System.out.println("Did not recieved the acknowledgement of Frame "+(idx+1));
                    System.out.println("Resending the Frame "+(idx+1));
                    System.out.println();
                    flag = reciever(s);
                }
                System.out.println("Recieved the acknowledgement for Frame "+(idx+1));
                System.out.println("Frame "+(idx+1)+" sent Successfully");
                idx++;
            }
            System.out.println();

        }

        System.out.println("Reciever recieved all the Frames");
        System.out.println("Recieved Frames are");
        System.out.println(arr);


    }
}

