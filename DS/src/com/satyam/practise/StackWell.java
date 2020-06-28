import java.io.*;
import java.util.*;
class StackWell{

  public static void stack_push(Stack<Integer> stack){
    for(int i=0;i<10;i++){
      stack.push(i);
    }
    System.out.println();
  }

  public static void stack_show(Stack<Integer> stack){
    if(stack.isEmpty()){
      return;
    }
    int x=stack.peek();
    System.out.print(x+" ");
    stack.pop();
    stack_show(stack);
    stack.push(x);
  }

  public static void stack_pop(Stack<Integer> stack){
    System.out.println("Popped"+stack.pop());
  }

  public static void stack_peek(Stack<Integer> stack){
    System.out.println("PEEK"+stack.peek());
  }

  public static void stack_search(Stack<Integer> stack,int data){
    int pos=(Integer)stack.search(data);
    if(pos==-1){
      System.out.println("Not Found");
    }else{
      System.out.println("Found at"+pos);
    }
  }

  public static void main(String args[]){
    Stack<Integer> stack=new Stack<Integer>();

    stack_push(stack);
    stack_show(stack);
    stack_pop(stack);
    stack_peek(stack);
    stack_show(stack);
    stack_pop(stack);
    stack_peek(stack);
     stack_search(stack,4);
     stack_search(stack,11);


  }
}
