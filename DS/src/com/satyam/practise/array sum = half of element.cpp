#include<iostream>
using namespace std;
int sum(int a[],int n)
{
	int k=0;
	for(int i=0;i<n;i++)
	{
		k+=a[i];
	}
	return k;
}
bool find(int a[],int n)
{
	int p=sum(a,n);
	if (p%2!=0)
	return false;
	
	p=p/2;
	
	int start=0;
	int end=n-1;
	while(start <= end)
	{
		int mid=start+(end-start)/2;
		if(a[mid]==p)
		return true;
		else if(a[mid]>p)
		end=mid-1;
		else
		start=mid+1;
	}
	return false;
	
}
int main()
{
	int a[]={1,2,3};
	int n=sizeof(a)/sizeof(a[0]);
	if(find(a,n))
	cout<<"Yes";
	else
	cout<<"No";
}
