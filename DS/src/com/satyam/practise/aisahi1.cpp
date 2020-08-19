#include<stdio.h>
#include<conio.h>
int main()
{
	int i,j,b[2][2];
	printf(" | | \n");
	printf("%c|%c|%c\n",'a','b','c');
	printf("_|_|_\n");
	printf(" | | \n");
	printf("%c|%c|%c\n");
	printf("_|_|_\n");
	printf(" | | \n");
	printf("%c|%c|%c\n");
	printf(" | | \n");
	
		printf("  |  |  \n");
	printf(" %c| %c| %c\n",' ',' ',' ');
	printf("__|__|__\n");
	printf("  |  |  \n");
	printf(" %c| %c| %c\n");
	printf("__|__|__\n");
	printf("  |  |  \n");
	printf(" %c| %c| %c\n");
	printf("  |  |  \n");
	for(i=0;i<3;i++)
	{
		for(j=0;j<3;j++)
		{
			b[i][j]=' ';
		}
	}
	printf("  |  |  \n");
	printf(" %c| %c| %c\n",b[0][0],b[0][1],b[0][2]);
	printf("__|__|__\n");
	printf("  |  |  \n");
	printf(" %c| %c| %c\n",b[1][0],b[1][1],b[1][2]);
	printf("__|__|__\n");
	printf("  |  |  \n");
	printf(" %c| %c| %c\n",b[2][0],b[2][1],b[2][2]);
	printf("  |  |  \n");
		
	getch();
	
}
