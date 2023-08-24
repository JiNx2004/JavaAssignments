package Week5;
import java.util.Scanner;

public class Q7 {
  boolean fun(int x , int y){
    if(x==y||x+y==5||x-y==5||y-x==5){
      return true;
    }
    else{
      return false;
    }
  }
  public static void main(String args[]){
    System.out.print("Enter 2 numbers : ");
    try (Scanner sc = new Scanner(System.in)) {
      int x=sc.nextInt();
      int y=sc.nextInt();
      Q7 obj = new Q7();
      System.out.println(obj.fun(x,y));
    } 
  }
}
