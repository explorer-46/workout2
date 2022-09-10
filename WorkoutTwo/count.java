import java.util.*;
class tile{
int edgeLg;
int area;
tile(int edgeLg){
this.edgeLg=edgeLg;
}
int getArea(){
area=edgeLg*edgeLg;
return area;
}
}
class floor{
int length;
int width;
floor(int length,int width){
this.length=length;
this.width=width;
}
void totaltiles(tile t1)
{
int tileArea=t1.getArea();
int floorArea=length*width;
int noofTiles=(floorArea/tileArea);
System.out.println("Tiles="+noofTiles);
}
}
class count{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the length of tile");
int tileLength=s.nextInt();
tile v=new tile(tileLength);
System.out.println("enter the length and width");
int floorLength=s.nextInt();
int floorWidth=s.nextInt();
floor f=new floor(floorLength,floorWidth);
f.totaltiles(v);
}
}
