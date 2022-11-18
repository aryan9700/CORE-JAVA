import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //syntax
        ArrayList<Integer> list = new ArrayList<>(5);//5 is initial capacity
     /*    list.add(123);
        list.add(1123);
        list.add(23);
        list.add(13);
        list.add(12);
        list.add(123);


        System.out.println(list.contains(23));//true or false if not present
      list.set(1, 99);
        list.remove(2);
        System.out.println(list);*/

        
        
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here, list[index] syntax will not work here 
            
        }

    }
    /*
     * working         _____
     * |arr|          /     \
     * |   |------>  /       \
     * |___|        /[0,0,0,0]\
     * stack 
     * 1.size of array list is internally fixed 
     * 2.array list fill by some amount 
     * ->it will a arraylist of say size, double of old size
     * ->old element are copied in new list
     * ->old one is deleted
     * ex-[1,2,3,4] ---> [1,2,3,4,.,.,.,.] array list of size 8
     * ammotised time complexity 0(1)
     * 
     * 
     * 
     *          
     */
}
