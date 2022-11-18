//reachest customer wealth
// https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},
                {4,5,6,7},
                {1,4,6}
        };
        int answer=maximumWealth(arr);
        System.out.println(answer);
    }
    static int maximumWealth(int[][] accounts){
        int ans=Integer.MIN_VALUE;
 //row=person
 //col=account   
    for (int person = 0; person < accounts.length; person++) {
        //when you start a new column, take a new sum for that row
        int sum=0;
       for (int account = 0; account < accounts[person].length; account++) {
        sum+=accounts[person][account];
       }
       //now we have some of accounts of person
       //check with overall ans
       if(sum>ans){
        ans=sum;
       }
        
    }return ans;
}
}