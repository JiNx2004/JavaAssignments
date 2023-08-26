//Program to print even elements of an array
package Week5;
import java.util.Scanner;

public class Q3 {
  void even(int Arr[]){
    for(int j = 0 ; j<Arr.length;j++){
      if(Arr[j]%2==0){
        System.out.println("Even elements are :"+Arr[j]);
      }
    }
  }
  public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
      System.out.print("Enter number of elements in list : ");
      int x = sc.nextInt();
      int arr[];
      arr = new int[x];
      for(int i=0;i<arr.length;i++){
        System.out.println("Enter element "+(i+1)+": ");
        int ele = sc.nextInt();
        arr[i] = ele;
      }
      Q3 obj = new Q3();
      obj.even(arr);
    }
  }  
}
