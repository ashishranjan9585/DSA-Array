public class ReverseAnArray {

     public static void main(String[] args) {
        //APPROACH -Two pointer  ye agr mera array size  n ka hai toh ye n/2 me kaam krke aa jyega 
         int arr[] = {10,20,30,40,50};
         int low = 0 ;
         int high = arr.length - 1 ;
         int temp = 0 ;
         while(low < high ){
           temp = arr[low];
           arr[low] = arr[high];
           arr[high] = temp;
           low++;
           high--;
         }
         for(int element : arr){
            System.out.println(element);
         }
     }
}
