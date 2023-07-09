import java.util.*;

public class HowManyNumberAreSmaller {
       public  static int[] smallerNumbersThanCurrent(int[] nums) {
        int duplicate[] = nums.clone();
        Arrays.sort(nums);
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(map.get(nums[i]) == null) {
                map.put(nums[i] , i );
            }
        }
        int output[] = new int[nums.length];
        for(int i = 0 ; i < duplicate.length ; i++){
            output[i] = map.get(duplicate[i]);
        }
        return output;
       }
     public static void main(String[] args) {
         int nums[] = {8,1,2,2,3};
         System.out.print(smallerNumbersThanCurrent(nums) + " ");
     }
}
