//order of execution of constructor destructor
#include<iostream>
using namespace std;
class satyam
{
	public:
		satyam()
		{
			cout<<"contructor satyam"<<endl;
		}
		~satyam()
		{
			cout<<"destructor satyam"<<endl;
		}
};
class sheel :public satyam
{
	public:
	sheel()
	{
		cout<<"constructor sheel"<<endl;
	}
	~sheel()
	{
		cout<<"destructor sheel"<<endl;
	}
};
class human :public sheel
{
	public:
		human()
		{
			cout<<"contructor human"<<endl;
		}
		~human()
		{
			cout<<"destructor human"<<endl;
		}
};
int main()
{
	human obj;
}
