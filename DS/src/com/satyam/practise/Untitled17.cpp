//multiple inheritance
#include<iostream>
using namespace std;
class satyam
{
	public:
		int height;	
};
class sheel
{
	public:
	int age;
};
class he :public satyam,public sheel
{
	public:
		void input(int a,int b)
		{
			height=a;
			age=b;
		}
		void display()
		{
			cout<<height<<endl<<age<<endl;
		}
};
int main()
{
	he obj;
	obj.input(6,19);
	obj.display();
	
}
