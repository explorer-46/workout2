import java.util.*;
class Employee{
int empid,a1,a2,a3;
String fName,result;
Employee(){
Scanner s=new Scanner(System.in);
System.out.println("enter the Eployee ID");
empid=s.nextInt();
System.out.println("enter the Field name");
fName=s.next();
System.out.println("enter the Assessment 1");
a1=s.nextInt();
System.out.println("enter the Assessment 2");
a2=s.nextInt();
System.out.println("enter the Assessment 3");
a3=s.nextInt();
}
void result(){
if(a1>=75&&a2>=75&&a3>=75)
{
System.out.println(empid+"\t is promoted");
}
else
{
System.out.println(empid+"\t not Demoted");
}
}
void cal(){
double total=a1+a2+a3;
double per=(total/300)*100;
System.out.println("total mark obtained:"+total);
System.out.println("Percentage obtained:"+per);
}
}
class employeeD{
public static void main(String args[]){
Employee ep=new Employee();
ep.result();
ep.cal();
}
}


