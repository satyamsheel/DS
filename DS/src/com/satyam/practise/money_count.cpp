#include<stdio.h>
int main()
{
	int t,n;
	scanf("%d",&t);
	while(t--)
	{
		scanf("%d",&n);
		 int c=0;
        if(n>=100)
        {
           c=c+n/100;
            n%=100;
        }
        if(n>=50)
        {
            c+=n/50;
            n%=50;
        }
        if(n>=10)
        {
            c+=n/10;
            n%=10;
        }
        if(n>=5)
        {
            c+=n/5;
            n%=5;
        }
        if(n>=2)
        {
            c+=n/2;
            n%=2;
        }
        if(n==1)
        {
            c+=1;
        }
        printf("%d\n",c);	
	}
	return 0;
}
