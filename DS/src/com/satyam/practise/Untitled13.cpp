//protected inheritance
#include<iostream>
using namespace std;
class satyam
{
	public:
		int myage;
	protected:
		int age;
	public:
	void input(int yo,int doo)
	{
		myage=yo;
		age=doo;
		}	
		
};
class sheel:protected satyam
{
	public:
		void set(int p,int t)
		{
			input(p,t);
		}
		void display()
		{
			cout<<myage<<age<<endl;
		}
};
int main()
{
	sheel obj;
	satyam obj1;
	obj.set(23,45);
	obj.display();
}
