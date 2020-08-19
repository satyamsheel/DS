#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
#include<time.h>
int display();
int compx();
int compo();
int i,j,a[3][3],k,l,T=0,b[3][3];
char ch;
int main()
{
	srand(time(0));
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			b[i][j]=0;
		}
	}
	

	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			a[i][j]='$';
		}
	}
	printf("select X or O");
	scanf("%c",&ch);
	switch(ch)
	{
		case 'x':do
		       {
		        printf("enter place to fill");
		       scanf("%d%d",&k,&l);
		       a[k][l]='X';
		       b[k][l]=1;
		       T++;
		       display();
		       compx();
		       }while(T!=4);
		       break;
		case 'o':do
		        {
		        printf("enter place to fill\n");
		       scanf("%d%d",&k,&l);
		       a[k][l]='O';
		       b[k][l]=1;
		       display();
		       compo();
		       }while(T!=4);
			   break;     
	}
}
int display()
{
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%c\t",a[i][j]);
		}
		printf("\n");	
	}
	getch();
	return 0;
}
int compx()
{
	int p;
	if(b[1][1]==1)//if centre is entered output is at corner
	{
		p=rand()%4;
		if(p==0)
		{
			a[0][0]='X';
			b[0][0]=1;
		}
		else if(p==1)
		{
			a[0][2]='X';
			b[0][2]=1;
		}
		else if(p==2)
		{
			a[2][0]='X';
			b[2][0]=1;
		}
		else if(p==3)
		    a[2][2]='X';
		    b[2][2]=1;
	}
	if(b[0][0]==1 || b[0][2]==1 || b[2][0]==1 || b[2][2]==1)
	{
		if(b[0][0]=1)
		{
		p=rand()%2;
		if(p==0)
		{
			a[0][2]='X';
			b[0][2]=1;
		}
		else if(p==1)
		{
			a[2][0]='X';
			b[2][0]=1;
		}
		else if(p==2)
		{
			a[2][2]='X';
			b[2][2]=1;
		}
	   }
	}
}
