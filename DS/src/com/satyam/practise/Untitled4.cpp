//using private access specifier
#include<iostream>
using namespace std;
class satyam
{
	private:
		int a;
	public:
	void dispaly()
	{
		cout<<a<<endl;
		}	
	void put(int value)
	{
		a=value;
		}	
};
int main()
{
	int p;
	satyam obj;
	cin>>p;
	obj.put(p);
	obj.dispaly();
}
