import java.util.Scanner;

public class LargestLength {
    static int getMaxLength(int a[]){
        int count = 0;
        int max = 0;
        for(int i = 0 ; i<a.length;i++){
            if(a[i] == 1){
                count++;
                max = Math.max(count,max);
            }
            else{
                count = 0 ;
            }

        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Element");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the Element");
        for(int i = 0 ; i<a.length;i++){
            a[i] = sc.nextInt();
        }
        System.out.println(getMaxLength(a));
    }
}
