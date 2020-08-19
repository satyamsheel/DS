#include<iostream>
using namespace std;
int main(){
	int t;
	cin>>t;
	while(t){
		long long int k,n,count=100000000,minCount=-1;
		cin>>n>>k;
		int arr[1000];
		for(int i=0;i<n;i++){
			cin>>arr[i];
		}
		for(int i=0;i<n;i++){
			if(k%arr[i]==0){
				int data = k/arr[i];
				if(data<count){
					count=data;
					minCount=arr[i];
				}
			}
		}
		cout<<minCount<<endl;
		t--;
	}
	return 0;
}
