#include<bits/stdc++.h>

using namespace std;
 
int main()
{
 int tcases;
 cin>>tcases;
 while(tcases--)
 {
    int num,val;
    cin>>num>>val;
    vector<int> arr1(num);
    for(int& i:arr1)
    cin>>i;
    
    
    
    sort(arr1.begin(),arr1.end());
    vector<int>::iterator it = lower_bound(arr1.begin(), arr1.end(), val);
    int lb = it - arr1.begin();
    int vac=0;
    for(int i=lb;i<num;i++)
    {
    if(val<arr1[i])
    {
    while(val<arr1[i])
    {
   	val=2*val;
    		vac++;
   	}
    		vac++;
    	}
    	else
    	vac++;
    	val=2*arr1[i];
    }
    int tot=lb+vac;
    if(lb!=0)
    {
    	vac=0;
    	lb--;
    	for(int i=lb;i<num;i++)
    	{
    	if(val<arr1[i])
   		{
    	while(val<arr1[i])
    		{
    		val=2*val;
    			vac++;
    			}
    		vac++;
    		}
    		else
    		vac++;
    		val=2*arr1[i];
    	}
    	int ans=min(vac+lb,tot);
    	cout<<ans<<endl;
    }
    else
    cout<<tot<<endl;
 }
 return 0;
}
