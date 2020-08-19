#include<stdio.h>
int main()
{
	int a[3][3];
	int i,j;
	char ch;
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			a[i][j]='•';
		}
	}
	printf("select X or O");
	scanf("%c",&ch);
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			printf("%c\t",a[i][j]);
		}
		printf("\n");
	}
}
