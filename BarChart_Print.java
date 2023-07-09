public class BarChart_Print {
     public static void main(String[] args) {
        int max = 0 ;
        int arr[] = {2,4,7,9,6};
        //Find the max first 
        for(int element : arr){
             if(element > max){
                max = element ;
             }
        }
        int min = 1 ;
        for(int i = max ; i >= 1 ; i--){
            for(int j = 0 ; j < arr.length ; j++){
                //(9 <= 2) false then else me jyesa  or wha space print kr denga  agr equal hai to star print kr denga 
                if(i <= arr[j])  {
                   System.out.print("*\t");
                }
                else{
                    System.out.print(" \t");
                }
            }
        }
        System.out.println( ) ;
     }
}
