//static keyword
#include<iostream>
using namespace std;
class satyam
{
	public:
		static int a;
	satyam()
	{
		a++;
		}	
	void display()
	{
		cout<<a<<endl;
		}	
};
int satyam :: a=0;
int main()
{
	satyam obj;
	obj.display();
	satyam obj1;
	obj1.display();
	satyam obj3;
	obj3.display();
}
