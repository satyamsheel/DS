#include<stdio.h>
int main()
{
	int t,n,f=1,i;
	scanf("%d",&t);
	while(t--)
	{
		scanf("%d",&n);
		if(n>=1 && n<=100)
		{
		for(i=n;i>=1;i--)
		{
			f=f*i;
		}
		printf("%d\n",f);
		f=1;
	}
	}
	return 0;
}
