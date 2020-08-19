#include<stdio.h>
#define MAX 50
int array_queue[MAX];
int rear=-1;
int front=-1;
void enqueue();
void dequeue();
void display();
int main()
{
	int choice;
	while(1)
	{
	printf("1.enqueue\n2.dequeue\n3.display\n4.quit");
	printf("enter choice");
	scanf("%d",&choice);
	switch(choice)
	{
		case 1:enqueue();
		break;
		case 2:dequeue();
		break;
		case 3:display();
		break;
		case 4:printf("quit");
		break;
		default:printf("invalid choice");
	}
}
}
void enqueue()
{
	int add_item;
	if(rear==MAX-1)
	printf("overflow");
	else
	{
		if(front==-1)
		front=0;
		printf("enter value to be inserted");
		scanf("%d",&add_item);
		rear=rear+1;
		array_queue[rear]=add_item;
	}
}
void dequeue()
{
	if(front==-1 || front>rear)
	{
		printf("underflow");
	}
	else
	{
		printf("value deleted is %d",array_queue[front]);
		front=front+1;
	}
}
void display()
{
	int i;
	if(front==-1)
	printf("queue empty");
	else
{
	printf("queue is:");
	for(i=front;i<rear;i++)
	printf("%d",array_queue[i]);
	printf("\n");
}
}
