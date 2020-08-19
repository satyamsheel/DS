//passing values to base class constructor
#include<iostream>
using namespace std;
class satyam
{
	public:
		int a;
		satyam(int k)
		{
			a=k;
		}
};
class sheel :satyam
{
	public:
		sheel(int m) :satyam(m)
		{
		}
		void display()
		{
			cout<<a;
		}
};
int main()
{
	sheel obj(10);
	obj.display();
}
