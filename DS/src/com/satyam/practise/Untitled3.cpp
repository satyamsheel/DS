//declaring function outside class
#include<iostream>
using namespace std;
class satyam
{
	public:
		int a;
		void display();
};
void satyam ::display()
{
	cout<<satyam::a;
 } 
 int main()
 {
 	satyam *obj=new satyam();
 	obj->a=567;
 	obj->display();
 }
