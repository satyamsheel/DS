#include<iostream>
using namespace std;
class satyam{
	public:
	int data;
	satyam* next;
	
};
void insert(satyam** root,int value)
{
	satyam* temp=new satyam;
	satyam* ptr;
	temp->data=value;
	temp->next=NULL;
	
	 if (*root == NULL) 
        *root = temp; 
    else { 
        ptr = *root; 
        while (ptr->next != NULL) 
            ptr = ptr->next; 
        ptr->next = temp; 
    }
}
void printlink(satyam* root) 
{ 
    while (root != NULL) { 
        cout << root->data << " "; 
        root = root->next; 
    } 
} 
satyam* arraytolink(int a[],int n)
{
	satyam *root=NULL;
	for(int i=0;i<n;i++)
	{
		insert(&root,a[i]);
	}
	return root;
}
int main()
{
	int a[]={2,3,4,5,6,6};
	int n=sizeof(a)/sizeof(a[0]);
 	satyam* root=arraytolink(a,n);
	printlink(root);
}
