import java.util.Arrays;

public class FindDuplicateNumber {
     public  static int findDuplicate(int[] nums){
         //Approach-2
         Arrays.sort(nums);
         for(int i = 0 ; i< nums.length ; i++){
             if(nums[i] == nums[i+1])
             return nums[i];
         }
         return -1; 


        //Brute force 
       /* for(int i = 0; i < nums.length-1 ; i++){
            for(int j = i+1 ; j < nums.length ; j++){
                if(nums[i] == nums[j]){
                    return nums[i];
                }
            }
      }

return -1; */
     }
     public static void main(String[] args) {
        int nums[] = {1,3,2,2,4};
        System.out.println(findDuplicate(nums));
     }
}
