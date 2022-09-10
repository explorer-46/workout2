import java.util.*;
class employee{
static int empno;
 static double salary,totalSalary;
 employee(double salary){
 empno++;
 System.out.println("Employee number="+empno);
 this.salary=salary;
  System.out.println("Salary="+salary);
 totalSalary=salary+totalSalary;
 }
 static void disp(){
 System.out.println("Total number of employee ="+empno);
 System.out.println("Total salary of all employee="+totalSalary);
 }
}
class employX{
public static void main(String args[]){
float a1,a2,a3,a4;
Scanner s=new Scanner(System.in);
System.out.println("Entet the first employee salary");
a1=s.nextFloat();
employee e1=new employee(a1);
System.out.println("Ente the second employee salary");
a2=s.nextFloat();
employee e2=new employee(a2);
System.out.println("Entet the Third employee salary");
a3=s.nextFloat();
employee e3=new employee(a3);
System.out.println("Entet the fourth employee salary");
a4=s.nextFloat();
employee e4=new employee(a4);
employee.disp();

}
}