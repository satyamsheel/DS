//changing acess specifier
#include<iostream>
using namespace std;
class satyam
{
	protected:
		int hello;
	public:
	 void set(int hell)
	 {
	 	hello=hell;
		 }	
};
class sheel:private satyam
{
	public:
		satyam :: hello;
		satyam :: set;
		void display()
		{
			cout<<hello;
		}
};
int main()
{
	sheel obj;
	obj.set(23);
	obj.display();
	
}
