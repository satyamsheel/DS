#include<iostream>
#include<math.h>
using namespace std;
int maxi(int a[][100],int row,int mid,int& max)
{
	int index=0;
	for(int i=0;i<row;i++)
	{
		if(a[i][mid]>max)
		{
			max=a[i][mid];
			index=i;
		}
	}
	return index;
}
int findingpeak(int a[][100],int row,int column,int mid)
{
	int	max=0;
	int max_index=maxi(a,row,mid,max);
	if(mid==0 || mid==column-1)
	return max;
	
	else if(a[max_index][mid-1]<=max && a[max_index][mid+1]<=max)
	return max;
	
	else if(a[max_index][mid-1]>max)
	return findingpeak(a,row,column,mid - ceil((double)mid / 2));
	
	else
	return findingpeak(a,row,column,mid + ceil((double)mid / 2));
		
}



int findpeak(int a[][100],int row,int column)
{
	return findingpeak(a,row,column,column/2);
}


int main()
{
	int a[][100]={ { 10, 8, 10, 10 }, 
                       { 14, 13, 12, 11 }, 
                       { 15, 9, 11, 21 }, 
                       { 16, 17, 19, 20 } };
	int row=4;
	int column=4;
	cout<<"peak element"<<findpeak(a,row,column);
}
