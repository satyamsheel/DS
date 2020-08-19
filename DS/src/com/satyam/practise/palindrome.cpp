#include<stdio.h>
int main()
{
	int t,n,i,p=0;
	scanf("%d",&t);
	while(t--)
	{
		scanf("%d",&n);
		for(i=n;i>0;i=i/10)
		{
			p=p*10+i%10;
		}
		if(n==p)
		printf("wins\n");
		else
		printf("losses\n");
	}
	return 0;
}
