class yo
{
public static int main(String args[])
{
yo1 obj=new yo1();
yo1 obj1=new yo1(20);
}
}
class yo1
{
public yo1()
{
System.out.println("small contrustor");
}
public yo1(int k)
{
System.out.println("contructor overloading");
}
}
