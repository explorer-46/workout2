class rectangle{
double length ,breadth;
rectangle(double x){
length=x;
breadth=x;
}
rectangle(double a,double b){
length=a;
breadth=b;
}
void getArea(){
double area=length*breadth;
System.out.println("Area="+area);
}
void getPerimeter(){
double perimeter=2*(length+breadth);
System.out.println("Perimeter="+perimeter);
}
}
class rectangleD{
public static void main(String args[]){
rectangle R=new rectangle(12);
rectangle r=new rectangle(10,15);
R.getArea();
R.getPerimeter();
r.getArea();
r.getPerimeter();
}
}