public class SumOfTwoArray {
      public static void AddTwoArray(int arr1[] ,int arr2[] , int result[]){
           int i = arr1.length - 1;
           int j = arr2.length - 1;
           int k = Math.max(arr1.length , arr2.length); //current index result
           int carry = 0 ;
           while(i >= 0 || j >= 0){
            int sum = arr1[i]+arr2[j]+carry; //ex -10
            result[k] = sum % 10; // in result put the result // 0
            carry = sum/10; //1 
             i--;
             j--;
             k--;
           }
           if(i >= 0){
             int sum = arr1[i]+carry;
              result[k] = sum % 10;
              carry = sum/10;
              i--;
              k--;
           }
           else if(j >= 0){
             int sum = arr2[j]+carry;
              result[k] = sum % 10;
              carry = sum/10;
              j--;
              k--;
           }
          result[0] = carry; 
          System.out.print(result);
           
      }
      public static void main(String[] args) {
         int arr1[] = {9,2,7,4};
         int arr2[] = {5,4,4,5};
         
         int result[] = new int[arr1.length + 1];

        AddTwoArray(arr1, arr2, result);
         
      }
}
