//Program to check divisibility of numbers from 1000 to 2000 both inclusive by 5&8.
public class Q1Divisibility{
  public static void main(String[]args){
    for(int i=1000;i<=2000;i++){
      if(i%5==0&&i%8==0){
        System.out.println(i);
      }

    }
  }


}