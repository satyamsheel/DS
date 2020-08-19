#include<stdio.h>
int main()
{
	int T,j,N,temp,i,d;
	scanf ("%d",&T);
    if(T>=1 && T<=1000)
	{
	for(j=1;j<=T;j++)
	{
		temp=1;
		scanf ("%d",&N);
		for(i=1;i<=N;i++)
		{
			d=N%i;
			if(temp<d)
			temp=d;			
		}
		printf ("%d",temp);
    }
    }
    return 0;
}
