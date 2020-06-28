class StackPop{


  public void pop(int top1,int forPop[]){
    int data;
    data=forPop[top1];
    forPop[top1]=0;
    System.out.println(data);

    StackShow stackshow=new StackShow();
    stackshow.show(top1,forPop);
  }


}
