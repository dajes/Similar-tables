import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean similar = true;
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> elements = new HashMap<>();
        System.out.println("Enter 10 values for the table A:");
        for(int i = 0; i < 10; i ++){
            int integer = sc.nextInt();
            if(!elements.containsKey(integer)) elements.put(integer, 1);
        }
        System.out.println("Enter 15 values for the table B:");
        for(int i = 0; i < 15; i++){
            int integer = sc.nextInt();
            if(!elements.containsKey(integer)){
                similar = false;
                break;
            } else {
                elements.put(integer, 2);
            }
        }
        for(int key : elements.keySet()){
            if(elements.get(key) == 1){
                similar = false;
                break;
            }
        }
        System.out.print("Given tables A and B are ");
        if(similar){System.out.println("similar.");}
        else{System.out.println("not similar.");}

    }
}
