//static functions
#include<iostream>
using namespace std;
class satyam
{
	public:
		static int a;
		static void increase()
		{
			a++;
		}
	
		void display()
		{
			cout<<a;
		}
		
};
int satyam::a=0;
int main()
{
	satyam obj;
	satyam :: increase();
	satyam :: increase();
	satyam :: increase();
	obj.display();
}
