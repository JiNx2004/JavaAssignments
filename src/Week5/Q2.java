package Week5;
import java.util.Scanner;
public class Q2 {
    Boolean rotation(String S1,String S2){
      String s3="";
      char ch;
      for(int i=0;i<S2.length();i++){
        ch = S2.charAt(i);
        s3 = ch + s3;
      }
      if(s3.equals(S1)==true){
        return true;
      }
      else{
        return false;
      }

    }
  public static void main(String args[]){
    String s1,s2;
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter string 1 : ");
      s1 = sc.nextLine();
      System.out.print("Enter string 2 : ");
      s2 = sc.nextLine();
    }
    Q2 obj = new Q2();
    System.out.println("Are two strings Rotationally equal ?: "+obj.rotation(s1, s2));

  }

}
