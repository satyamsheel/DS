class practice
{
public static void main(String args[])
{
sheel2 obj=new sheel2();
obj.this1();
obj.this2();
obj.this3();
}
}
abstract class satyam
{
abstract void this1();
abstract void this2();
abstract void this3();
}
abstract class sheel extends satyam{
public void this1()
{
System.out.println("thi sis this1");
}
}
abstract class sheel1 extends sheel
{
public void this2()
{
System.out.println("this is this2");
}
}
class sheel2 extends sheel1
{
public void this3()
{
System.out.println("this is this2");
}
}
