#include<iostream>
using namespace std;
int findingpeak(int a[],int low,int high,int n)
{
	int mid=(low+high)/2;
	if(mid==0 || a[mid]>a[mid-1] && mid==n-1 || a[mid]>a[mid+1])
	return mid;
	else if (a[mid]<a[mid-1])
	{
		high=mid-1;
		return findingpeak(a,low,high,n);
	}
	else
	{
		low=mid+1;
		return findingpeak(a,low,high,n);
	}
}
int findpeak(int a[],int n)
{
	return findingpeak(a,0,n-1,n);
}

int main()
{
	int a[]={1,4,10,49,1000,2000};
	int n=sizeof(a)/sizeof(a[0]);
	cout<<n<<"\n satyam";
	cout<<"Index is "<<findpeak(a,n);
}
