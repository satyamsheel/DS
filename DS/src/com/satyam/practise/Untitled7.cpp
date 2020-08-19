//parametrized constructor
#include<iostream>
#include<string>
using namespace std;
class satyam
{
	private:
		int a;
		string name;
	public:	
	satyam()
	{
		a=5;
		cout<<"default";
		name="satyam sheel";
		}	
	satyam (string input)
	{
		cout<<"one parameter";
		a=5;
		name=input;
		}	
	satyam(string iname,int p)
	{
		cout<<"2 parameter";
		a=p;
		name=iname;
		}	
	void display()
	{
		cout<<a<<endl<<name<<endl;
		}	
};
int main()
{
	satyam obj;
	satyam obj1("satyam");
	satyam obj2("satyam sheel",19);
	obj.display();
	obj1.display();
	obj2.display();
}
