//Program using function to count unique values in an array of 15 elements
package Week5;

import java.util.Scanner;

public class Q10 {
  void unique(int arr[]){
    int arrr[];
    arrr=new int[50];
    for(int i = 0;i<arr.length;i++){
      for(int j = 0 ;j<arr.length;j++){
        if(arr[i]==arr[j]){
          arrr[i]++;
        }
      }
    }
    System.out.println("Unique elements are: ");
    for(int i = 0 ; i<arr.length;i++){
      if(arrr[i]==1){
        System.out.println(arr[i]);
      }
    }

  }  
  public static void main(String args[]){
    int arr[];
    arr = new int[15];
    try (Scanner sc = new Scanner(System.in)) {
      for(int i = 0;i<15;i++){
        System.out.println("Enter element "+i+":");
        arr[i]= sc.nextInt();
      }
    }
    Q10 obj = new Q10();
    obj.unique(arr);

  }
}
