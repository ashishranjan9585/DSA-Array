public class PreComputation {
      public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90};
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1 ; i < arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        System.out.print("Original Array");
        for(int element : arr){
            System.out.print(element + " ");
        }
        System.out.println( ) ;

        System.out.print("Prefix Array");
        for(int element : prefix){
            System.out.print(element + " ");
        }
    System.out.println() ;

//If you want any query sum u can easily calculate it
 int left = 2;
 int right = 5;
 System.out.print("Range of " + left + " " + right);
 System.out.println() ;
 System.out.print(prefix[right] - prefix[left -1 ]);

      } 
}
