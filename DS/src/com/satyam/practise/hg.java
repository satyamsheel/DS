class hg
{
public static void main(String srgs[])
{
satyam obj=new satyam();
obj.update();
obj.display();
}
}
class sheel
{
final int i=20;
}
class satyam extends sheel
{
void update()
{
  i++;
}
void display()
{
System.out.println(i);
}
}
