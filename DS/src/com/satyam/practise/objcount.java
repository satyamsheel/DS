class objcount
{
public static void main(String args[])
{
sheel obj=new sheel();
sheel obj1=new sheel();
sheel obj2=new sheel();
obj2.display();
}
}
class sheel
{
static int a=0;
sheel()
{
a++;
}
void display()
{
System.out.println(a);
}
}
