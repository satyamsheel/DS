#include<stdio.h>
#include<string.h>
int main()
{
	char ch[50],c[50];
	int t,p,d[100],i,m;
	scanf("%d",&t);
	while(t--)
	{
		gets(ch);
		p=strlen(ch);
		c[50]=ch[50];
		for(i=0;i<p;i++)
		{
			if(ch[i]==' ')
			{
				d[m]=i;
				m++;
				if(ch[i+1]>=32 && ch[i+1]<=122)
				ch[i+1]=ch[i+1]-32;
				c[m]=ch[i+1];
			}
		}
		if(ch[0]>=97 && ch[0]<=122)
		{
			ch[0]=ch[0]-32;
			c[0]=ch[0];
		}
		for(i=0;i<p;i++)
		{
			printf("%c.",c[i]);
		}
	}
}
