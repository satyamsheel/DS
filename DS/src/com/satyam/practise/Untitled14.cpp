//protected inheritance
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
		void set1(int p)
		{
			set(p);
		}
		void display()
		{
			cout<<hello;
		}
};
int main()
{
	sheel obj;
	obj.set1(23);
	obj.display();
	
}
