//friend function
#include<iostream>
using namespace std;
class satyam
{
	int a,b;
	public:
	int set(int c,int d);
	friend int use (satyam obj);
};
int satyam::set(int c,int d)
{
	a=c;
	b=d;
}
int use(satyam obj)
{
	return obj.a+obj.b;
}
int main()
{
	satyam obj1;
	obj1.set(2,3);
	cout<<use(obj1);
}
