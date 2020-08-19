#include<stdio.h>
int main()
{
	int T,N,c,e=0,i;
    scanf("%d",&T);
    while(T--)
    {
    	scanf("%d",&N);
    	for(i=N;i>0;i=i/10)
    	{
    		c=i%10;
    		e=e*10+c;
		}
		printf("%d\n",e);
		e=0;
	}
}
