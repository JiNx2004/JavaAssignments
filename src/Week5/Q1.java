package Week5;
import java.util.Scanner;
public class Q1 {
  String image(String z, String b){
    char ch;
    for(int i = 0 ; i<z.length();i++){
        ch = z.charAt(i);
        b = ch+b;     
    }
    return b;
  
  }
  public static void main(String args[]){
      System.out.print("Enter a string :");
      try (Scanner sc = new Scanner(System.in)) {
        String x = sc.nextLine();
        String y = "";
        Q1 obj = new Q1();
        System.out.println("Mirror image of string is :"+obj.image(x,y));
    }
  }  
}
