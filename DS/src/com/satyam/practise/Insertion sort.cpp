#include<iostream>
using namespace std;
void sorted(int a[],int n)
{
	int key,j;
	for(int i=1;i<n;i++)
	{
		key=a[i];
		j=i-1;
		while(j>=0 && a[j]>key)
		{
			a[j+1]=a[j];
			j=j-1;
		}
		a[j+1]=key;
	}
}
int main()
{
	int a[]={4,5,3,2,7};
	int n=sizeof(a)/sizeof(a[0]);
	sorted(a,n);
	cout<<"Final array";
	for(int i=0;i<n;i++)
	{
		cout<<a[i]<<"\t";
	}
}
