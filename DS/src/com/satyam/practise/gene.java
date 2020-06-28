import java.util.*;

class gene
{
    public static void main(String [] args)throws Exception
    {
        Scanner sc=new Scanner(System.in);
        int a[][],i,j;
         a=new int[2][2];
         String p[]=new String[4];
         String s[]=new String[2];
         char ch[]=new char[2];
         char ch1[]=new char[2];
         System.out.println("Enter father traits");
         s[0]=sc.nextLine();
         System.out.println("Enter mother traits");
         s[1]=sc.nextLine();
         System.out.println("Building punnet square");
         int q=0;
         for( i=0;i<2;i++)
         {
             for( j=0;j<2;j++)
             {
                ch[q]=s[0].charAt(j);
                ch1[q]=s[1].charAt(j);
                q++;
                }
                q=0;
            }
            /*System.out.println(ch[0]);
            System.out.println(ch[1]);
            System.out.println(ch1[0]);
            System.out.println(ch1[1]);*/
            q=0;
            for(i=0;i<2;i++)
            {
                for(j=0;j<2;j++)
                {
                    p[q]=new StringBuilder().append(ch[i]).append(ch1[j]).toString();
                    q++;
                }
            }
            /*for(i=0;i<4;i++)
            {
                System.out.println(p[i]);
            }*/
            System.out.println("Genotype");
            q=0;
            j=0;
            for(i=0;i<4;i++)
            {
                System.out.println(p[i]);
                if(p[i].equals(p[i].toUpperCase()))
                {
                    q++;
                }
                else
                    j++;  
            }
            System.out.println("Ratio of character stic is "+j+":"+q);
        
    }
    
}