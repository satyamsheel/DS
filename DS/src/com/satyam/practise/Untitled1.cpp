#include<stdio.h>
#include<conio.h>
int display();
int i,j,a[3][3],k,l;
char ch;
int main()
{
	

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
		case 'x':printf("enter place to fill");
		       scanf("%d%d",&k,&l);
		       a[k][l]='X';
		       display();
		       break;
		case 'o':printf("enter place to fill");
		       scanf("%d%d",&k,&l);
		       a[k][l]='o';
		       display();
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
