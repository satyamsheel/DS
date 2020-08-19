//virtual function
#include<iostream>
using namespace std;
class thanos
{
	public:
	virtual	void display()                          //try removing virtual
		{
			cout<<"thanos kamal ka ha"<<endl;
		}
};
class spider :public thanos
{
	public:
		void display()
		{
			cout<<"makda"<<endl;
		}
};
class iron:public spider
{
	public:
		void display()
		{
			cout<<"loha"<<endl;
		}
};
void best(thanos &t)
{
t.display();
}
int main()
{
	thanos obj;
	spider obj1;
	iron obj2;
	best(obj);
	best(obj1);
	best(obj2);
	
}
