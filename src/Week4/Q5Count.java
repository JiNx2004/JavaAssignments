import java.util.Scanner;

public class Q5Count {
  public static void main(String args[]){
    System.out.print("Enter a string: ");
    try (Scanner sc = new Scanner(System.in)) {
      String x = sc.nextLine();
      char ch;
      int c1=0;
      int c2=0;
      for(int i = 0; i<x.length();i++){
        ch = x.charAt(i);
        if(Character.isDigit(ch)){
          c1+=1;
        }
        if(Character.isAlphabetic(ch)){
          c2+=1;
        }
      }
      System.out.println("Number of digits: "+c1);
      System.out.println("Number of alphabets: "+c2);    
    }
  }
  
}
