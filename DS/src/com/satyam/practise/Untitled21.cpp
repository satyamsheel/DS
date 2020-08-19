//this keyword
#include<iostream>
using namespace std;
class satyam
{
	public:
		int height;
		void setheight(int height)
		{
			this->height=height;                    //try removing this
		}
		void display()
		{
			cout<<height;
		}
};
int main()
{
	satyam obj;
	obj.setheight(6);
	obj.display();
}
