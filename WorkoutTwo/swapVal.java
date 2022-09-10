import java.util.*;
class swapVal{
int a,b;
swapVal(){
}
swapVal(int m,int n){
a=m;
b=n;
}
void swap(int a,int b){
int c=a;
a=b;
b=c;
}
void swapref(swapVal val){
System.out.println("before swapping value of a="+a+"and value of b="+b);
int c;
c=val.a;
val.a=val.b;
val.b=c;
System.out.println("After swapping value of a="+a+"and value of b="+b);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int x=sc.nextInt();
int y=sc.nextInt();
swapVal sv=new swapVal();
System.out.println("before swapping value of a="+x+"and value of b="+y);
sv.swap(x,y);
System.out.println("After swapping value of a="+x+"and value of b="+y);
swapVal sv1=new swapVal(x,y);
sv1.swapref(sv1);
}
}