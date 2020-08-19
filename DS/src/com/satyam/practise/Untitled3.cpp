#include<stdio.h>
#include<stdlib.h>
int i,j,a[3][3],k,l,I,J;
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
	printf("select X or O\n");
	scanf("%c",&ch);
	switch(ch)
	{
		case 'x':printf("enter place to fill");
		       scanf("\n%d%d",&k,&l);
		       a[k][l]='X';
		       	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			printf("%c\t",a[i][j]);
		}
		printf("\n");
	}
		       break;
		case 'o':printf("enter place to fill");
		       scanf("%d%d",&k,&l);
		       a[k][l]='O';
			   break;     
	}
}


