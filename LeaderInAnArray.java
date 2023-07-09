import java.util.*;
public class LeaderInAnArray {
     //Function to find the leaders in the array.
    public static ArrayList<Integer> leaders(int arr[] , int n){
          int max = 0 ;
        ArrayList<Integer> list = new ArrayList<>();
        for(int  i = arr.length - 1 ; i >=0 ; i--){
             if(arr[i] >= max){
                 max = arr[i];
                 list.add(max);  //[2,5,17]
             }
         }
         Collections.reverse(list); //[17,5,2]
         return list;
    }
     public static void main(String[] args) {
         int arr[] = {16,17,4,3,5,2};
         int n = 6;
         System.out.print(leaders(arr, n));
     }
}
