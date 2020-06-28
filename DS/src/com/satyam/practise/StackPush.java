class StackPush{

  public int top=0;
  public int Stack[]=new int[5];

  public void push(int data){
    Stack[top]=data;
    top++;

    StackShow stackshow=new StackShow();
    stackshow.show(top,Stack);
  }

  public void pop(){
    StackPop stackpop=new StackPop();
    top--;
    stackpop.pop(top,Stack);
  }
}
