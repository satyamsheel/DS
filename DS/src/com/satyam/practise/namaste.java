import java.util.Scanner;
class namaste
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  int a=Integer.parseInt(sc.nextLine());
  try{
  if(a>20)
  {
  throw new Exception("bhak budbak");
  }
  }
  catch(Exception e)
  {
  System.out.println(e);
  }
}
}
