package arrays;
import java.util.Scanner;
public class first {
    public static void main(String[] args) {
        int array[] = new int[10];
        Scanner scan = new Scanner(System.in);
// int sum=0;
int max=array[0]; 
        System.out.println("Enter 6 integers:");
        for (int i = 0; i < 6; i++) {
            array[i] = scan.nextInt();
            // sum+=array[i];
            if(array[i]>max){
                max=array[i]; 
            }
        }
        System.out.println(max);
        // System.out.println("You entered:");
        // for (int i = 0; i < 6; i++) {
        //     System.out.print(array[i]+", ");
        // }
        // System.out.println(sum);
        scan.close();
    }
}  
