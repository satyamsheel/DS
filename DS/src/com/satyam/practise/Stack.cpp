#include<bits/stdc++.h>
using namespace std;

void show(stack<int>stack2){
    while(!stack2.empty()){
	    cout<<stack2.top()<<" ";
	    stack2.pop();
	}
	cout<<endl;
}

void bubblesort(int arr[], int n){
    int i, j;  
    for (i = 0; i < n-1; i++)      
    for (j = 0; j < n-i-1; j++)  
        if (arr[j] > arr[j+1])  
            swap(arr[j], arr[j+1]); 
}

int temp;
int main()
{
	int n;
	cin>>n;
	int arr[n];
	stack<int> stack1;
	
	for(int j=0;j<n;j++){
		cin>>arr[j];
		stack1.push(arr[j]);
	}
	stack<int> stack2;
	
	while(!stack1.empty()){
	    if(stack2.empty()){
	        stack2.push(stack1.top());
	        stack1.pop();
	        continue;
	    }
	    if(stack1.top()/10 == 0  && stack2.top()/10 == 0 && abs(stack1.top()-stack2.top())==1){
            int a = max(stack1.top(),stack2.top());
            int b = min(stack1.top(),stack2.top());
            stack2.pop();
            stack1.pop();
            stack2.push((a*10)+b);
            continue;
	    }
	    
	    if(stack1.top()/10 == 0  && stack2.top()/100 == 0 && stack2.top()/10!=0){
	        if(abs(stack2.top()%10-stack1.top())==1 || abs((stack2.top()/10)%10-stack1.top())==1){
	            int x = stack2.top()%10;
	            int y = (stack2.top()/10)%10;
	            int a = max(stack1.top(),max(x,y));
	            int b = min(stack1.top(),min(x,y));
	            stack1.pop();
	            stack2.pop();
	            stack2.push(a*10 + b);
	            continue;
	        }
	        else if(stack1.top()>(stack2.top()/10)%10){
	            stack2.push(stack1.top());
	            stack1.pop();
	            continue;
	        }
	    }
	    
	    if(stack1.top()/10!=0 && stack1.top()/100 == 0  && stack2.top()/10 == 0){
	        if(abs(stack1.top()%10-stack2.top())==1 || abs((stack1.top()/10)%10-stack2.top())==1){
	            int x = stack1.top()%10;
	            int y = (stack1.top()/10)%10;
	            int a = max(stack2.top(),max(x,y));
	            int b = min(stack2.top(),min(x,y));
	            stack1.pop();
	            stack2.pop();
	            stack2.push(a*10 + b);
	            continue;
	        }
	    }
	    
	    if(stack1.top()/10!=0 && stack1.top()/100 == 0  && stack2.top()/100 == 0){
	        int a = stack1.top()%10;
            int b = (stack1.top()/10)%10;
            int c = stack2.top()%10;
            int d = (stack2.top()/10)%10;
            if(abs(a-d)==1 ||  abs(b-c)==1){
                int x = max(a,max(b,max(c,d)));
                int y = min(a,min(b,min(c,d)));
                stack1.pop();
                stack2.pop();
                stack2.push(x*10 + y);
                continue;
            }
	    }
	  
	  if(stack1.top()>stack2.top()){
	      stack2.push(stack1.top());
	      stack1.pop();
	  }  
	  else{
	        temp=stack1.top();
	        stack1.pop();
	        stack1.push(stack2.top());
	        stack2.pop();
	        stack1.push(temp);
	        continue;
	    }
	}
	
	show(stack2);
	bubblesort(arr,n);
	for(int i=n-1;i>=0;i--){
	    cout<<arr[i]<<" ";
	}
}
