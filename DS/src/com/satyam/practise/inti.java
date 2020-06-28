class inti
{
  public static void main(String args[])
  {
    into obj =new into();
    obj.a=23;
    obj.b=45;
    obj.sum();
    System.out.println(obj.sum);
  }
}
class into extends inti
{
  int a,b,sum=0;
  public void sum()
  {
    sum=a+b;
  }
}
