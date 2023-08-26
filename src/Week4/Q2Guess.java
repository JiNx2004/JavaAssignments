//Program to make the user guess a randomly generated number
import java.lang.Math;
import java.util.Scanner;
public class Q2Guess {
  public static void main(String args[]){
    int rand = (int)(Math.random()*10);
    try (Scanner sc = new Scanner(System.in)) {
      int g = sc.nextInt();
      while(g!=rand){
        System.out.println("Try again: ");
        g = sc.nextInt();
      }
      System.out.println("Well Guessed !");
    }
  }

  
}
