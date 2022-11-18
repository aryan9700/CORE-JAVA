package array;

public class arraystype {
    public static void main(String[] args) {
        
    
    //Q.store a roll no
    int a =19;
    //Q.store a name 
    String name = "hawk";
    //Q.store 5 roll no
    int[] rnos = new int[5];
    //or
     int[] rno2 = {1, 3, 5, 8, 9};
     // int[] rnos; // declaration of array, compiletime, rnos is getting defined in stack
     // ros = new int[5]; //initialisation, runtime, dynamic memory allocation, actually here object is created in memory{heap}

    /*
    arrays syntax
    datatype[] variable_name = new datatype[size];
    new is used to create a object in heap memory=runtime
    all the type of data in the array should be same 
                    _____
    | |            /     \
    |_| stack ==  / {1,2} \ heap
    1.arrya object are in heap
    2.heap object are not continuous like c 0r c++ because heap allocate on runtime in java
    3.dynamic memory allocation
    hence: may not be continuous-> depend on JVM
    indexices of array
    print (arr[0])
    print (arr[3])
    by default if not mention array then it contain for int {0,0,0....} store is stack only, {primitives=something that cannot be broken down , int char float boolean}
                                                    for string {null} its a literal, store in heap{all obj and classes string = broken down in chars arrays hashmap}

    */

}}
