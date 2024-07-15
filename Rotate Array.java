class Solution {
    static void reverse(int arr[] , int low , int high){
        if(arr.length < 1  || arr.length < 2 ) {
            return ;
        }
        while(low < high){
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
        return ;
    }
    public void rotate(int[] arr, int k) {
          k = k % arr.length;
        //1ST Reverse
       reverse(arr , 0 , arr.length-k-1);

       //2  PART REVERSE
       reverse(arr , arr.length-k , arr.length-1);
        
        //full reverse
       reverse(arr, 0 , arr.length-1);
    }
    
}
