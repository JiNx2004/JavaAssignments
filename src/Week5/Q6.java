package Week5;

import java.util.Scanner;

public class Q6 {
  void mobile_number(long y){
    long arr[];
    arr = new long[100];
    while(y!=0){
      long x = y%10;
      y=y/10;
      arr[(int)x]++;
      }
      System.out.println("Missing digits are: ");
      for(int i = 0;i<10;i++){
        if(arr[i]==0){
          System.out.print(i);
        }          
        }
      }
  public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
      long x = sc.nextLong();
      Q6 obj = new Q6();
      obj.mobile_number(x);
    }

  }
  
}
