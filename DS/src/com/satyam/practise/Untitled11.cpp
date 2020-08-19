//inheritance
#include<iostream>
using namespace std;
#include<string>
class satyam
{
	public:
		int age1;
		string name1;
		void name(string myname)
		{
		name1=myname;
	    }
	    void age(int myage)
	    {
	    	age1=myage;
		}  
};
class sheel : public satyam
{
	public:
	int year;
	void saal(int thisyear)
	{
		year=thisyear;
	}
	void display()
	{
		cout<<name1<<"\t"<<age1<<"\t"<<year<<endl;
	}
};
int main()
{
	sheel obj;
	obj.age(19);
	obj.name("satyam");
	obj.saal(2019);
	obj.display();
}
