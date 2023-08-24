import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
	   try (Scanner sc = new Scanner(System.in)) {
      int n=sc.nextInt();
             	   int result=0;
      int res=0;
      int temp=n;
      while(n!=0){
          int rem=n%10;
      		n/=10;
      		res+=rem*rem*rem;
      }
      if(res==temp)
      		result=1;
      else
      		result=0;
      System.out.print(result);
    }
}
}