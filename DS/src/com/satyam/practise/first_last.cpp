#include<stdio.h>
int main()
{
	int T,n,i,p;
	scanf("%d", &T);
	while(T!=0)
	{
		int c=0,x=1;
		scanf("%d", &n);
		p=n;
		while(p!=0)
		{
			p=p/10;
			c=c+1;
		}
		for(i=1;i<c;i++)
		{
			x=x*10;
		}
			
			printf("%d\n", ((n/x)+(n%10)));
		T--;
	}
	return 0;
}
