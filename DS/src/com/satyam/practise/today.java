class today
{
public static void main(String [] args)
{
FileOutputStream ni=new FileOutputStream("out.txt");
DataOutputStream in=new DataOutputStream(ni);
in.writeUTF("thi is me");

FileInputStream out=new FileInputStream("out.txt");
DataInputStream tut=new DataInputStream(out);
String s=tut.readUTF();
System.out.println(s);
}
}
