//different types of object creation
#include<iostream>
using namespace std;
class satyam
{
	public:
		int t;
		
	void hero()
	{
		cout<<"hello"<<endl;
		cout<<t;
		}	
};
int main()
{
	satyam obj;
	obj.t=65;
	obj.hero();
	satyam *obj1=new satyam();
	obj1->t=45;
	obj1->hero();
}
