import java.util.Scanner;
public class ContainerWithMostWater {
   
    /**
     * @param a
     * @return
     */
    static int containerWithMostWater(int a[] ){
   /* O(N^2) - >   
    int maxArea = Integer.MIN_VALUE;
      int   n = a.length;
        int area = 0 ;
       
        for(int i = 0 ; i<n ; i++){
            int left = a[i];
            for(int j = i+1;j<n;j++){
             int right = a[j];
             int distance = j -i ;
             area =Math. min(left ,right) * distance;
             maxArea = Math.max(maxArea,area);
        }
    }
    return maxArea;
}  */
 
//O(N) ->
     int maxArea = Integer.MIN_VALUE ;
     
     int left = 0 ;
     int right = a.length-1;
     while(left < right){
        int height = Math.min(a[left] , a[right]);
        int distance  = right - left ;
        int area = distance * height;
        maxArea = Math.max(maxArea,area);
     }
     return maxArea;
    }   
public static void main(String[] args){
      int a[] = {1,8,6,2,5,4,8,3,7};
      int n = a.length;
 System.out.println(containerWithMostWater(a));
}
}  