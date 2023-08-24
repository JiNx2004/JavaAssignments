package Week5;
import java.util.Scanner;

public class Q8 {
  void count(String s){
    char x;
    int arr[];
    arr = new int[200];
    for(int i = 0;i<s.length();i++){
      x = s.charAt(i);
      int y = x;
      arr[y]++;
    }
    for(int k = 0 ; k<arr.length;k++){
      if(arr[k]!=0){
      System.out.println("Charecter "+(char) k+" occurences = "+arr[k]);
      }
    }

  }
    public static void main(String args[]){
      try (Scanner sc = new Scanner(System.in)) {
        System.out.println("Enter a text/string : ");
        String s = sc.nextLine();
        Q8 obj = new Q8();
        obj.count(s);
      }

    }  
}
