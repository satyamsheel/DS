#include<stdio.h>
int main()
{
	int N,i,e=0,T,j;
	
	scanf ("%d",&T);
	if(T>=1 && T<=1000)
	{
	for(j=1;j<=T;j++)
	{
	scanf ("%d",&N);
	for(i=N;i>0;i=i/10)
	{
		e=e+i%10;
	}
	printf ("%d\n",e);
	e=0;
    }
    }
    return 0;
}
