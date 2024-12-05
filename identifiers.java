import java.util.Scanner;

public class identifiers
 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt(); 
        int per = num1 % num2;
        int sum = num1 + num2;
        int diff = num1 - num2;
        System.out.println("The sum is: " + sum); 
        System.out.println("The diff is: " + diff); 
        System.out.println("The percentage is: " + per); 
        scanner.close();
    }
}
