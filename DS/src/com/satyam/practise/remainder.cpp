#include<stdio.h>
int main()
{
	int T,A,B,j;
	scanf ("%d",&T);
    if(T>=1 && T<=1000)
	{
	for(j=1;j<=T;j++)
	{
		scanf ("%d",&A);
		scanf ("%d",&B);
		printf ("%d\n",A%B);
    }
    }
    return 0;
}
