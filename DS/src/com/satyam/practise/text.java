import java.io.*;
class text
{
public static void main(String [] args)throws Exception
{
FileOutputStream yes=new FileOutputStream("imp.txt");
DataOutputStream no=new DataOutputStream(yes);
no.writeUTF("this is a text file this is very usefull");

FileInputStream yo=new FileInputStream("imp.txt");
DataInputStream po=new DataInputStream(yo);
String str=po.readUTF();
System.out.println(str);
}
}
