#include<stdio.h>
int main()
{
	int T,N,d,c=0,i;
	scanf("%d",&T);
	while(T--)
	{
		scanf("%d",&N);
		for(i=N;i>0;i=i/10)
		{
			d=i%10;
			if(d==4)
			c++;
		}
		printf("%d\n",c);
		c=0;
	}
	return 0;
}
