//destructor
#include<iostream>
using namespace std;
class satyam
{
	public:
		satyam()
		{
			cout<<"satyam sheel"<<endl;
		}
		~satyam()
		{
			cout<<"destroyed";
		}
};
int main()
{
	satyam *obj=new satyam();
	delete obj;
}
