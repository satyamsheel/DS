import java.io.*;
class Triangle{

   Point pointA;
   Point pointB;
   Point pointC;

  Point point=new Point();
  pointA.x=23;
  pointB.x=34;
  pointC.x=45;


  public void draw(){
    System.out.println(pointA.x+"  "+pointB.x+"  "+pointC.x);
  }
}
