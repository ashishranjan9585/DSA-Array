
public class printMaximumSumSubArray {
    static int MximumSubArray(int a[]){
        int max_sum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0 ;
        int beg = 0 ;
        int cur_sum = 0 ;
        for(int i = 0;i<a.length;i++){
            cur_sum += a[i];
            if(cur_sum < a[i]){
                cur_sum = a[i];
                beg = i ;
            }
            if(cur_sum > max_sum){
                max_sum = cur_sum ;
                start = beg;
                end = i ;
            }

        }
        
        return Arrays.copyOfRange(a,start,end+1);
    }
   
}
