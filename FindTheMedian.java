public class FindTheMedian {
     public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
      int n1 = nums1.length;
      int n2  = nums2.length;
      int total = n1 + n2;
      int[] result = new int[n1+n2];
      int i = 0 ;
      int j = 0 ;
      int k = 0 ;
      while(i < n1 && j < n2){
         
          if(nums1[i] < nums2[j]){  //nums[i] smaller than nums[j]
           result[k] = nums1[i];
           i++;
           k++;
          } 
          else{
              result[k] = nums2[j];
              j++;
              k++;
          }
        
        //Agar kisi ka element rest bch jaa rha to ussy v k me store krna hoga 
        if(i == n1-1){
            while(j < n2){
                 result[k++] = nums2[j++];
                break;
            }
        }
        else{
            if(j == n2-1){
                while(i < n1){
                    result[k++] = nums1[i++];
                 break;
                }
            }
        }
      }
      //find the median 
      //even length
      if(total % 2 == 0){
          return (float)(result[total/2 - 1] + result[total/2])/2;
      }
      //odd length
      else{
          return result[total/2];
      }
    }
    public static void main(String[] args) {
      int[] nums1 = {1,3} ;
      int[] nums2 = {2} ;
      System.out.print("Median :- " + findMedianSortedArrays(nums1,nums2));
    } 
}
