#include<iostream>
using namespace std;
void sortedarray(int a[],int l,int mid,int n)
{
	 int l1=mid-l+1;
	 int r1=n-mid;
	 int L[l1],R[r1];
	 for(int i=0;i<l1;i++)
	 {
	 	L[i]=a[i];
	 }
	 for(int j=0;j<r1;j++)
	 {
	 	r1=a[mid+1+j];
	 }
	 int i=0;
	 int j=0;
	 int k=l;
	 while(i<l1 && j<r1)
	 {
	 	if(L[i]<=R[j])
	 	{
	 		a[k]=L[i];
	 		i++;
		 }
		 else
		 {
		 	a[k]=R[j];
		 	j++;
		 }
		 k++;
	 }
	 while(i<l1)
	 {
	 	a[k]=L[i];
	 	i++;
	 	k++;
	 }
	 while(j<r1)
	 {
	 	a[k]=R[j];
	 	j++;
	 	k++;
	 }
}
void sort(int a[],int l,int n)
{
	if(l<n)
	{
		int mid;
	mid=l+(n-l)/2;
	sortedarray(a,l,mid,n);
	}
	
}
int main()
{
	int a[]={1,7,9,7,2,3,7,9};
	int n=sizeof(a)/sizeof(a[0]);
	sort(a,0,n-1);
	cout<<"Sorted array";
	for(int i=0;i<n;i++)
	{
		cout<<a[i]<<"\t";
	}
}
