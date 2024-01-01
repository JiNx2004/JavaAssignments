package Week6;

public class Q4Employee {
  void work(){
    System.out.print("Work faster");
  }
  void getSalary(){
    int salary = 10000;
    System.out.println("Salary : "+salary);
  }
  public static void main(String args[]){
  HRManager obj = new HRManager();
  obj.work();
  obj.getSalary();
  obj.AddEmployee();
  }
}
class HRManager extends Q4Employee{
  void work(){
    System.out.println("Stop working");
  }
  void AddEmployee(){
    System.out.println("Employee added");
  }

}
  
  

