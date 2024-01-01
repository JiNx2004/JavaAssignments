package Week4;
//Program to reverse a string
import java.util.Scanner;

public class Q4Reverse {
  public static void main(String args[]){
    System.out.print("Enter a string :");
    try (Scanner sc = new Scanner(System.in)) {
      String x = sc.nextLine();
      String y = "";
      char ch;
      for(int i = 0 ; i<x.length();i++){
        ch = x.charAt(i);
        y = ch+y;                                         //There is a difference between ch+y and y+ch
      }
      System.out.println("Reversed string : " +y);
    }
  }
  
}
