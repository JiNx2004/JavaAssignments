package Week5;

import java.util.Scanner;

public class Q5 {
   boolean is_prime(int y){
    for(int i = 2 ;i<y;i++){
      if(y%i==0){
        return false;
      }
      if(i==1){
        return false;
      }
      
    }
    return true;
  }
  public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter number : ");
      int x = sc.nextInt();
      Q5 obj = new Q5();
      System.out.println("Is the number prime? : "+obj.is_prime(x));
    }

  }
}
