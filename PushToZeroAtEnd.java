import java.util.Scanner;

public class PushToZeroAtEnd {
           static void pushzeroAtEnd(int a[]){
            int n = a.length;
            int count = 0 ;
            for(int i = 0 ; i < n ; i++){
                if(a[i] != 0){
                    a[count++] = a[i];
                }
            }
            while(count < n){
                a[count++] = 0;
            }
            for(int i = 0 ; i<n;i++){
                System.out.println(a[i]);
            }
           }
           public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the no. of Element");
            int n = sc.nextInt();
            System.out.println("Enter the Element");
            int a[] = new int[n];
            for(int i = 0 ; i<n ; i++){
                a[i] = sc.nextInt();     
            }
            pushzeroAtEnd(a);
           }
}
