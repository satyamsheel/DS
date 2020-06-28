class naya
{
public static void main(String args[])
{
abc obj=new abc();
abc obj1=new abc(50);
abc obj2=new abc(100);
}
}
class abc
{
public abc()
{
System.out.println("this is it");
}
public abc(int a)
{
  System.out.println(a);
}
}
