public class CheckArrayIsSortedOrNot {
       public static void main(String[] args) {
        
        int arr[] = {10,20,30,40,50};
        //Approch 1 cur-Element jo hai right side wale element se smaller hona chaiye
   /*      for(int i = 0 ; i < arr.length ; i++){
             for(int j = i + 1 ; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                     System.out.println("Not Sorted.....");
                     return ;
                }
             }
            
       }
        System.out.println("Sorted.....");
*/ 

//Approach -2 check previous element brra to nahi 
 for(int i = 1 ; i < arr.length ; i++){
     if(arr[i-1] > arr[i]){
        System.out.println("Not Sorted......");
 }
 }
 System.out.println("Sorted......");

   }
}
