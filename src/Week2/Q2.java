//Program to print even or odd
import java.util.Scanner;
public class Q2 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
          System.out.print("Enter a number: ");
          int num = reader.nextInt();
          reader.close();
          if(num % 2 == 0)
              System.out.println(num + " is even");
          else
              System.out.println(num + " is odd");
        
    }
}