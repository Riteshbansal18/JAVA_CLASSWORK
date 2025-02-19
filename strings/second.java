package strings;
import java.util.*;
public class second {
public static void main(String[]args){
// String str ="hello";
// String st=" world !";
// System.out.println(str+st);
// System.out.println(str.equals(st));
// System.out.println(str==st);
// String str2="hello";
// System.out.println(str==str2);
Scanner scanner =new Scanner(System.in);
String str3= scanner.nextLine();
System.out.println(str3);

int length=str3.length();
for (int i=0;i<length;i++){
    for (int j=i+1;j<=length;j++){
        System.out.print(str3.substring(i, j)+" ");
    }
    System.out.println("");
}           //substring of a string

String str4="hello";
String str5="world";
System.out.println(str4.concat(str5)); //concatenation of two strings
    }
}
