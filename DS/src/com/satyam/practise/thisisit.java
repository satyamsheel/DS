import java.io.*;
class thisisit
{
public static void main(String [] args)throws IOException
{
FileOutputStream op=new FileOutputStream("this_is_java.txt");
DataOutputStream in=new DataOutputStream(op);
in.writeUTF("this is a proud moment for india");

FileInputStream po=new FileInputStream("this_is_java.txt");
DataInputStream ni=new DataInputStream(po);
String s=ni.readUTF();
System.out.println(s);
}
}
