import java.util.*;
 public class SubArray {
    
    public static boolean subArrayWithZeroSum(int[] a ,int n){
        
        Set<Integer>set = new HashSet<>();
        int sum = 0;
        for(int i = 0;i<a.length;i++){
            sum+=a[i];
            if(set.contains(sum)){
                return true;
            }
            set.add(sum);
        }
        return false;
    }
  
  public static void main(String[] args) {
   // int a[] ={2,3,1,-4,3,-2};
   Scanner sc = new Scanner(System.in);
     System.out.println("Enter the no of Element");
       int n = sc.nextInt();
      System.out.println("Enter the  Element");
      int[] a = new int[n];
    
       for(int i = 0 ;i<n;i++){
              System.out.println(a[i]);
          } 
  // System.out.println(subArrayWithZeroSum(a , n));
   subArrayWithZeroSum(a , n);

   sc.close();
  }
}