//find numbers with even numbers of digits

// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class leetcode1 {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
        System.out.println(digits2(112345));
    }
    static int findNumbers(int[] nums){//we dont write static in leetcode ==in oops
        int count = 0;
        for(int num:nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    //function to check whether number contain even digits or not 
    static boolean even(int num){
        int numberofDigits = digits2(num);
        /*
        if(numberofDigits %2==0){
            return true;
        }return false;
        */
        //shortcut
        return numberofDigits %2==0;
    }
    static int digits2(int num){
        if(num<0){
            num=num*-1;
        }
        return (int)(Math.log10(num))+1;
    }
    //count number of digits in a number
   /*  static int digits(int num){

        if(num<0){
            num=num*-1;
        }
        int count=0;
        while(num>0){
            count++;
            num=num / 10; // num/=10

        }
        return count;*/
    }

