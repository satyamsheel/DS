class satyam1
{
  public static void main(String args[])
  {
    sat1 obj=new sat1();
    obj.p();
    obj.p1();
    obj.p2();
    obj.p3();
  }
}
abstract class sheel                              //abstract classs
{
  public void p()
  {
    System.out.println("p is working");
  }
  abstract public void p1();                        //abstract methods
  abstract public void p2();                        //abstract methods
  abstract public void p3();                        //abstract methods
}
abstract class sat extends sheel                    //child abstact class
{
  public void p1()
  {
    System.out.println("p1 is working");
  }
}
class sat1 extends sat
{
  public void p2()
  {
    System.out.println("p2 is working");
  }
  public void p3()
  {
    System.out.println("p3 is working");
  }
}
