//Program to print unique combinations from 3 digits
package Week5;

import java.util.Scanner;

public class Q9 {

  void combinations(int i,int j,int k){
    System.out.println("" + i + j + k);
    System.out.println("" + i + k + j);
    System.out.println("" + j + i + k);
    System.out.println("" + j + k + i);
    System.out.println("" + k + i + j);
    System.out.println("" + k + j + i);
  }
  public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
      boolean condition=true;
      while(condition){
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x==y||x==z||y==z){
          System.out.println("Please pick 3 unique digits so as to generate unique combinations ");
        }
        else{
          condition = false;
          Q9 obj = new Q9();
          obj.combinations(x, y, z);
        }

      }
    } 
    
  }
}
