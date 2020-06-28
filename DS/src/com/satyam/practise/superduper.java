class superduper
{
public static void main(String args[])
{
b obj=new b();
System.out.println(obj.i);
obj.show();
}
}
class a
{
int i=5;
public void show()
{
System.out.println("hello");
}
}
class b extends a
{
int i=2;
public void show()
{
System.out.println("hi");
}
}
