class thisis
{
public static void main(String args[])
{
satyam obj=new satyam();
obj.display();
}
}
class sheel
{
 int i=5;

}
class satyam extends sheel
{
int i=4;

void display()
{
  System.out.println(super.i);
}
}
