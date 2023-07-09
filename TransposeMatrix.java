public class TransposeMatrix {
    
        static void transposeOFMatrix(int a[][]){
             int n = a.length;
             for(int i = 0 ; i<n; i++){
                 for(int j = i; j < n ; j++){
                     int swap = a[i][j];
                     a[i][j] = a[j][i];
                     a[j][i] = swap ;
                 }
             }
         }
         static void print(int a[][]){
            int n =a.length;
               for(int i = 0 ; i<n; i++){
                 for(int j = 0 ; j < n ; j++){
                     System.out.print(a[i] [j] + " ");
                 }
               }
         }
         public static void main(String[] args){
             int a[][] = { 
                 {1,2,3},
                 {4,5,6},
                 {7,8,9} 
             };
          //   print(a);
           
             transposeOFMatrix(a);
           
           print(a);
         }
     }

