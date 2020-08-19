#include<stdio.h>
unsigned reduce(unsigned num, unsigned k) {
  if (k <= 0) {
    return num;  
  }
  if (num == 0) {
    return 10;  
  }
  unsigned path1 = reduce(num/10, k)*10 + num%10;
  unsigned path2 = reduce(num/10, k-1);
  return path1 < path2 ? path1 : path2;
}

int main(void) {
	int t,n;
	scanf("%d",&t);
	while(t--)
	{
	scanf("%d",&n);
	if(n<10)
	printf("%d\n",n);
	else
    printf("%u\n", reduce(n, 1));
   }
  
}
