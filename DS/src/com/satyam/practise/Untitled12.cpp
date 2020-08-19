//protected
#include<iostream>
using namespace std;
class satyam
{
	public:
		int sattu;
	public:
	int  sattu1;
		
};
class sheel :public satyam
{
	public:
		void input(int hello,int hello1)
		{
			sattu=hello;
			sattu1=hello1;
		}
		void dispaly()
		{
			cout<<sattu<<sattu1;
		}
};
int main()
{
	satyam obj;
	sheel obj1;
	obj1.input(23,34);
	obj1.dispaly();
	
}
