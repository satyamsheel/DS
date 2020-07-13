#include<bits/stdc++.h>
#define int      long long int
#define fir        first
#define Sec        second
#define pb       push_back
#define advan    ios_base::sync_with_stdio(false),cin.tie(NULL),cout.tie(NULL);
#pragma GCC optimize "trapv"
#define endl     '\n'

 
using namespace std;
 
signed main()
{
 advan;
 int tcases;
 cin>>tcases;
 while(tcases--)
 {
     int num;
     cin>>num;
     vector<int> vect1(num),vect2(num);
     std::map<int, int> mapp1,mapp2,mapp3,mapp4,mapp5;
     for(int i=0;i<num;i++){
     cin>>vect1[i];
     mapp1[vect1[i]]++;
     mapp3[vect1[i]]++;
     }
     
     
     for(int i=0;i<num;i++){
     	cin>>vect2[i];
     	mapp2[vect2[i]]++;
     	mapp3[vect2[i]]++;
     }
     int f=0;
     for(auto i:mapp3)
     {
         if(i.Sec%2!=0)
         {
             f=1;
             break;
         }
     }
     int arr1[num],arr2[num];
     for(int i=0;i<num;i++)
     arr1[i]=vect1[i];
     for(int i=0;i<num;i++)
     arr2[i]=vect2[i];
     sort(arr1,arr1+num);
     sort(arr2,arr2+num);
     int p=0;
     for(int i=0;i<num;i++)
     {
         if(arr1[i]!=arr2[i])
         {
             p=1;
             break;
         }
     }
     if(p==0)
     cout<<0<<endl;
     else if(f==1)
     cout<<-1<<endl;
     else
     {
     	int c=0;
     	int minimised=INT_MAX;
     	for(int i=0;i<num;i++)
     	minimised=min(minimised,vect1[i]);
     	for(int i=0;i<num;i++)
     	minimised=min(minimised,vect2[i]);
        for(auto i:mapp1)
        {
            if(i.Sec>mapp2[i.fir])
            mapp4[i.fir]=(i.Sec-mapp2[i.fir])/2;
        }
        for(auto i:mapp2)
        {
            if(i.Sec>mapp1[i.fir])
            mapp5[i.fir]=(i.Sec-mapp1[i.fir])/2;
        }
        std::vector<int> v1,v2;
        for(auto i:mapp4)
        {
            for(int j=0;j<i.Sec;j++)
            v1.pb(i.fir);
        }
        for(auto i:mapp5)
        {
            for(int j=0;j<i.Sec;j++)
            v2.pb(i.fir);
        }
        sort(v1.begin(),v1.end());
        sort(v2.begin(),v2.end(),greater<int>());
        
        for(int i=0;i<v1.size();i++)
        {
        int arr3=v1[i];
        int arr4=v2[i];
        	
        	
       	c+=min(2*minimised,(min(arr3,arr4)));
        }
        	cout<<c<<endl;
     }
 }
 return 0;
}
