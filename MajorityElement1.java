public class MajorityElement1 {
      public  static int majorityElement(int[] nums) {
        //Moore Voting Algorithm
        int cur = -1;
        int count = 0;
        for(int i = 0 ; i< nums.length;i++){
            if(count == 0){
                cur = nums[i];
                count = 1;
            }
            else if(nums[i] == cur){
                count++;
            }
            else{
                count --;
            }
        }
        int finalcount = 0;
        for(int e : nums){
            if(e == cur){
                finalcount++;
            }
        }
        if(finalcount > nums.length/2){
            return cur;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
    
}