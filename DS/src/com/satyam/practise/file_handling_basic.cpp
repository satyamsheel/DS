#include<iostream>
#include<fstream>
using namespace std;
int main()
{
	fstream satyam;
	satyam.open("satyam.txt",ios::in);
	if(satyam.is_open()){
	cout<<"yes bbay";
	}
	else
	cout<<"no baby";
}
