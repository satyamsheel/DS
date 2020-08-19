#include<iostream>
using namespace std;
class satyam
{
	public:
		int data;
		satyam* next;
};
void insert(satyam** head,int data)
{
	satyam* new_node=new satyam();
	new_node->data=data;
	new_node->next=*head;
	*head=new_node;
}
void insertafter(satyam* prev,int data)
{
	if(prev ==NULL)
	{
		cout<<"Not possible";
	}
	satyam* new_node=new satyam();
	new_node->data=data;
	new_node->next=prev->next;
	prev->next=new_node;
}

void end(satyam** head,int data)
{
	satyam* new_node=new satyam();
	satyam* last=*head;
	new_node->data=data;
	new_node->next=NULL;
	if(*head == NULL)
	{
		*head=new_node;
		return;
	}
	while(last->next != NULL)
	{
		last=last->next;
	}
	last->next=new_node;
	return;
}
void prin(satyam *head)
{
	while (head->next!= NULL)
	{
		cout<<" "<<head->data;
		head=head->next;
	}
}

int main()
{
	satyam* head =NULL;
	end(&head, 6);  
      
    insert(&head, 7);  
    insert(&head, 1);  
    end(&head, 4);  
    insertafter(head->next, 8);  
      
    cout<<"Created Linked list is: ";  
    prin(head);
	
}
