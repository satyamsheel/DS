#include <bits/stdc++.h>
#include <algorithm>
#include <queue>
#define ll long long
#define mp make_pair
#define pb push_back
#define ff first
#define ss second
#define pii pair<int,int>
#define mod 998244353
#define endl '\n'
#define f(i,a,b) for(i=a;i<b;i++)
#define MAX(a,b,c)  max(a,max(b,c))
#define MIN(a,b,c)  min(a,min(b,c))
#define PI 3.1415926535897932
#define fast_io ios_base::sync_with_stdio(false);cin.tie(NULL);cout.tie(NULL);
#define input_file freopen("op.txt", "r", stdin);
#define output_file freopen("op1.txt", "w", stdout);
using namespace std;

int main(){
	#ifndef ONLINE_JUDGE
		input_file
		// output_file
	#endif
		fast_io
	
	ll n,i,na=0,nb=0,c=0;
	char l,r;
	cin>>n;
	string s;
	cin>>s;
	
	f(i,0,n){
		if(s[i]=='A') na++;
		else if(s[i]=='B') nb++;
	}

	i=0;

	while(i<n && s[i]=='-') c++ , i++;

	if(s[0]=='-' && i<n && s[i]=='A') na += c;

	if(i==n-1 && s[i]=='A') na++;

	c = 0;

	while(i<n-1){
		if((s[i]=='A' || s[i]=='B') && s[i+1]=='-'){
			l = s[i];
			c = 1;
		}
		else if(s[i]=='-' && (s[i+1]=='A' || s[i+1]=='B')){
			r = s[i+1];
			if(l=='A' && r=='A'){
				na += c;
			}
			else if(l=='B' && r=='B'){
				nb += c;
			}
			else if(l=='B' && r=='A'){
				na += c/2;
				nb += c/2;
			}
			c = 0;
		}
		else if(s[i]=='-' && s[i+1]=='-'){
			c++;
		}

		// cout<<i<<" "<<s[i]<<" "<<s[i+1]<<"  "<<na<<" "<<nb<<"  "<<l<<" "<<r<<endl;

		i++;
	}

	if(c > 0){
		if(l=='B') nb += c;
		c = 0;
	}

	// cout<<na<<" "<<nb<<endl;

	if(na > nb) cout<<"A";
	else if(nb > na) cout<<"B";
	else cout<<"Coalition government";


	return 0;
}