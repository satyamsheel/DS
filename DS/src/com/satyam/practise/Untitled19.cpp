//method overriding
#include<iostream>
using namespace std;
class satyam
{
	public:
		void hello()
		{
			cout<<"satyam sheel";
		}
};
class sheel:public satyam
{
	public:
		void hello()
		{
			cout<<"thapar university";
		}
};
int main()
{
	sheel obj;
	obj.hello();
}
