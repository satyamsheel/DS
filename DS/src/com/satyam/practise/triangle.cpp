#include<stdio.h>
int main()
{
	int t,a,b,c;
	scanf("%d",&t);
	while(t--)
	{
		scanf("%d",&a);
		scanf("%d",&b);
		scanf("%d",&c);
		if((a+b+c)==180)
		printf("YES\n");
		else
		printf("NO\n");
	}
}
