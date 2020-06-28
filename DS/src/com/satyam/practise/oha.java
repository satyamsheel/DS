class oha interface clonable
{
public static void main(String[] args)
{
satyam obj=new satyam();
obj.i=23;
obj.j=34;
obj.show();
satyam.obj1=obj.clone();

}
}
class satyam
{
  int i,j;
  public void show()
  {
  System.out.println(i);
}
}
