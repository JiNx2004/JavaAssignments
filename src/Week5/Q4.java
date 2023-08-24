package Week5;
import java.util.Scanner;

public class Q4 {
   boolean isPalindrome()
	{
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter string : ");
      String str = sc.nextLine();
      String rev = "";
      boolean ans = false;

      for (int i = str.length() - 1; i >= 0; i--) {
      	rev = rev + str.charAt(i);
      }
      if (str.equals(rev)) {
      	ans = true;
      }
      return ans;
    }
	}
	public static void main(String[] args)
	{
		Q4 obj = new Q4(); 	
		System.out.println(obj.isPalindrome());
	}
  
}
