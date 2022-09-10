import java.util.*;
class noOfObject{
static int c;
noOfObject()
{
c+=1;
}
public static void main(String args[]){
noOfObject A=new noOfObject();
noOfObject B=new noOfObject();
noOfObject C=new noOfObject();
noOfObject D=new noOfObject();
System.out.println("number of object="+c);
}
}