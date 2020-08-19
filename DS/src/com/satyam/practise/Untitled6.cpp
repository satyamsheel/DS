//use of constructor
#include<iostream>
using namespace std;
class satyam
{
	private:
		int a;
		string name;
	public:
		satyam()
		{
			a=55;
			name="satyam sheel";
			}	
		void display()
		{
			cout<<a<<endl<<name;
		}	
};
int main()
{
	satyam obj;
	obj.display();
}
