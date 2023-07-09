import java.util.Scanner;

public class Minimum_Sum {
     static int minimumSumSubArray(int a[]){
        int n = a.length;
        int min_sum = Integer.MAX_VALUE;
        int cur_sum = Integer.MAX_VALUE;
        for(int i = 0 ;i<n ; i++){
            if(cur_sum > 0){
                cur_sum = a[i];
            }
            else{
                cur_sum += a[i];
            }
            min_sum = Math.min(cur_sum , min_sum);
        }
        return min_sum;
     }
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Element");
        int n = sc.nextInt();
        System.out.println("Enter the Element");
        int a[] = new int[n];
        for(int i = 0 ; i<n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(minimumSumSubArray(a));
         }
}
