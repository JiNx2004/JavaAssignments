package Week6;
import java.util.Scanner;
public class Q1Person {
  String name;
  int age;
  Q1Person(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter name : ");
    name = sc.nextLine();
    System.out.print("Enter age : ");
    age = sc.nextInt();
    sc.close();
  }
  void print(){
    System.out.println("Name : "+name);
    System.out.println("Age : "+age);
  }
  public static void main(String args[]){
    Q1Person obj = new Q1Person();
    obj.print();
  }




  }
  

